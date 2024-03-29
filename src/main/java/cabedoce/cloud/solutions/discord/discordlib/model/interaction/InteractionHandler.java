package cabedoce.cloud.solutions.discord.discordlib.model.interaction;

import cabedoce.cloud.solutions.discord.discordlib.response.InteractionResponse;

public interface InteractionHandler {
	//TODO javadoc to explain different commands
	public InteractionResponse handleApplicationCommand(Interaction interaction);
	
	public InteractionResponse handleApplicationCommandAutoComplete(Interaction interaction);
	
	public InteractionResponse handleMessageComponent(Interaction interaction);
	
	public InteractionResponse handleModalSubmit(Interaction interaction);
	
	public InteractionResponse handlePong(Interaction interaction);
}
