package cabedoce.cloud.solutions.discord.discordlib.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Security;

import javax.annotation.PostConstruct;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cabedoce.cloud.solutions.discord.discordlib.exception.MissingHandlerException;
import cabedoce.cloud.solutions.discord.discordlib.handler.ApplicationCommandAutoCompleteHandler;
import cabedoce.cloud.solutions.discord.discordlib.handler.ApplicationCommandHandler;
import cabedoce.cloud.solutions.discord.discordlib.handler.CommandHandler;
import cabedoce.cloud.solutions.discord.discordlib.handler.MessageComponentHandler;
import cabedoce.cloud.solutions.discord.discordlib.handler.ModalSubmitHandler;
import cabedoce.cloud.solutions.discord.discordlib.handler.PongHandler;
import cabedoce.cloud.solutions.discord.discordlib.handler.annotations.Command;
import cabedoce.cloud.solutions.discord.discordlib.model.interaction.Interaction;
import cabedoce.cloud.solutions.discord.discordlib.response.InteractionResponse;

public abstract class InteractionController {
	private static String HEX_KEY;

	private static final String PING_BODY = "\"type\":1";
	
	private static final String INTERACTION_URL = "https://discord.com/api/v8/interactions/%s/%s/callback";
	
	private ObjectMapper mapper;
	
	private ApplicationCommandHandler applicationCommandHandler;
	
	private ApplicationCommandAutoCompleteHandler applicationCommandAutoCompleteHandler;
	
	private MessageComponentHandler messageComponentHandler;
	
	private ModalSubmitHandler modalSubmitHandler;
	
	private PongHandler pongHandler;
	
	protected InteractionController(ApplicationCommandHandler applicationCommandHandler,
			ApplicationCommandAutoCompleteHandler applicationCommandAutoCompleteHandler,
			MessageComponentHandler messageComponentHandler, ModalSubmitHandler modalSubmitHandler,
			PongHandler pongHandler) {
		this.applicationCommandHandler = applicationCommandHandler;
		this.applicationCommandAutoCompleteHandler = applicationCommandAutoCompleteHandler;
		this.messageComponentHandler = messageComponentHandler;
		this.modalSubmitHandler = modalSubmitHandler;
		this.pongHandler = pongHandler;
	}

	@PostConstruct
	public void init() throws MissingHandlerException {
		handleMissingHandlers();
		HEX_KEY = System.getenv("DiscordHexKey");
		mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_ABSENT);

	}
	
	
	private void handleMissingHandlers() throws MissingHandlerException {
		if(applicationCommandHandler == null)
			throw new MissingHandlerException("ApplicationCommandHandler");
		if(applicationCommandAutoCompleteHandler == null)
			throw new MissingHandlerException("ApplicationCommandAutoCompleteHandler");
		if(messageComponentHandler == null)
			throw new MissingHandlerException("MessageComponentHandler");
		if(modalSubmitHandler == null)
			throw new MissingHandlerException("ModalSubmitHandler");
	}

	@PostMapping("/post")
	ResponseEntity<String> interactionReceiver(@RequestBody String body, @RequestHeader("X-Signature-Ed25519") String signature,
			@RequestHeader("X-Signature-Timestamp") String timestamp, RestTemplate restTemplate) throws Exception {
		if (body.equals(PING_BODY)) {
			return acknowledgeDiscordPingTest(timestamp, body, signature);
		}
		Interaction interaction = mapper.readValue(body, Interaction.class);
		if(interaction.hasInvalidIdOrToken()) return ResponseEntity.badRequest().build();
		InteractionResponse interactionResponse = useHandlersMethodBasedOnInteractionType(interaction);
		return postInteractionResponse(interaction, interactionResponse, restTemplate);
	}
	
	public InteractionResponse useHandlersMethodBasedOnInteractionType(Interaction interaction) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		String commandName = interaction.getInteractionData().getName();
		if(interaction.isApplicationCommand()) {
			return reflectionCallToCommandHandler(commandName, applicationCommandHandler, interaction);
		}
		if(interaction.isApplicationCommandAutoComplete()) {
			return reflectionCallToCommandHandler(commandName, applicationCommandAutoCompleteHandler, interaction);
		}
		if(interaction.isMessageComponent()) {
			return reflectionCallToCommandHandler(commandName, messageComponentHandler, interaction);
		}
		if(interaction.isModalSubmit()) {
			return reflectionCallToCommandHandler(commandName, modalSubmitHandler, interaction);
		}
		return reflectionCallToCommandHandler(commandName, pongHandler, interaction);
	}
	
	private InteractionResponse reflectionCallToCommandHandler(String commandName,
			CommandHandler applicationCommandHandler, Interaction interaction) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		Method methodToExecute = fetchMethodToExecuteFromCommandHandler(applicationCommandHandler, commandName);
		return (InteractionResponse) methodToExecute.invoke(applicationCommandHandler, interaction);
	}
	
	private Method fetchMethodToExecuteFromCommandHandler(CommandHandler applicationCommandHandler, String commandName) throws ClassNotFoundException {
		Method[] methods = applicationCommandHandler.getClass().getDeclaredMethods();
		for(int i = 0; i < methods.length; i++) {
			Command command = methods[i].getAnnotation(Command.class);
			if(command != null && command.name().equalsIgnoreCase(commandName)) {
				return methods[i];
			}
		}
		return null;
	}

	public ResponseEntity<String> postInteractionResponse(Interaction interaction, InteractionResponse interactionResponse, RestTemplate restTemplate) throws JsonProcessingException{
		return restTemplate.postForEntity(createInteractionCallBackUrl(interaction), createHttpEntityFromInteractionResponse(interactionResponse), String.class);
	}
	
	public String createInteractionCallBackUrl(Interaction interaction) {
		return String.format(INTERACTION_URL, interaction.getId(),interaction.getToken());
	}
	
	public HttpEntity<String> createHttpEntityFromInteractionResponse(InteractionResponse interactionResponse){
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		try {
			return new HttpEntity<>(mapper.writeValueAsString(interactionResponse), headers);
		} catch (Exception e) {
			//TODO Log error
			return null;
		}
	}

	public ResponseEntity<String> acknowledgeDiscordPingTest(String timestamp, String body, String signature) throws Exception {
		Security.addProvider(new BouncyCastleProvider());
		Signer signer = initializeSignerWithDiscordSignature(timestamp, body, signature);
		try {
			if (!signer.verifySignature(Hex.decodeHex(signature))) {
				System.out.println("Invalid request signature sent.");
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("invalid request signature");
			}
		} catch (DecoderException e) {
			System.out.println("Could not decode hex signature.\n");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.ok().body(new JSONObject().put("type", 1).toString());
	}

	private Signer initializeSignerWithDiscordSignature(String timestamp, String body, String signature) {
		Signer signer = new Ed25519Signer();
		signer.init(false, getEd25519PublicKey());
		String message = timestamp + body;
		signer.update(message.getBytes(), 0, message.length());
		return signer;
	}

	private Ed25519PublicKeyParameters getEd25519PublicKey() {
		byte[] publicKeyBytes;
		try {
			publicKeyBytes = Hex.decodeHex(HEX_KEY);
		} catch (DecoderException e) {
			System.out.println("Could not decode hex public key.\n");
			e.printStackTrace();
			return null;
		}
		return new Ed25519PublicKeyParameters(publicKeyBytes, 0);
	}
	
}
