package cabedoce.cloud.solutions.discordlib.model.interaction;

import com.fasterxml.jackson.annotation.JsonProperty;

import cabedoce.cloud.solutions.discordlib.message.Message;
import cabedoce.cloud.solutions.discordlib.model.GuildMember;
import cabedoce.cloud.solutions.discordlib.model.User;
import cabedoce.cloud.solutions.discordlib.model.enumerations.InteractionType;

public class Interaction {

	@JsonProperty
	private String id;
	
	@JsonProperty("application_id")
	private String applicationId;
	
	@JsonProperty("type")
	private InteractionType interactionType;
	
	@JsonProperty("data")
	private InteractionData interactionData;
	
	@JsonProperty("guild_id")
	public String guildId;
	
	@JsonProperty("channel_id")
	public String channelId;
	
	@JsonProperty("member")
	private GuildMember guildMember;
	
	@JsonProperty
	private User user;
	
	@JsonProperty
	private String token;
	
	@JsonProperty
	private int version;
	
	@JsonProperty
	private Message message;
	
	@JsonProperty
	private String locale;
	
	@JsonProperty("guild_locale")
	private String guildLocale;

	public boolean hasInvalidIdOrToken() {
		return this.getId().contains("/") || this.getToken().contains("/");
	}
	
	public boolean isApplicationCommand() {
		return getInteractionType().equals(InteractionType.APPLICATION_COMMAND);
	}
	
	public boolean isApplicationCommandAutoComplete() {
		return getInteractionType().equals(InteractionType.APPLICATION_COMMAND_AUTOCOMPLETE);
	}
	
	public boolean isMessageComponent() {
		return getInteractionType().equals(InteractionType.MESSAGE_COMPONENT);
	}
	
	public boolean isModalSubmit() {
		return getInteractionType().equals(InteractionType.MODAL_SUBMIT);
	}
	
	public boolean isPong() {
		return getInteractionType().equals(InteractionType.PONG);
	}
	
	
	@Override
	public String toString() {
		return "Interaction [id=" + id + ", applicationId=" + applicationId + ", interactionType=" + interactionType
				+ ", interactionData=" + interactionData + ", guildId=" + guildId + ", channelId=" + channelId
				+ ", guildMember=" + guildMember + ", user=" + user + ", token=" + token + ", version=" + version
				+ ", message=" + message + ", locale=" + locale + ", guildLocale=" + guildLocale + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public InteractionType getInteractionType() {
		return interactionType;
	}

	public void setInteractionType(InteractionType interactionType) {
		this.interactionType = interactionType;
	}

	public InteractionData getInteractionData() {
		return interactionData;
	}

	public void setInteractionData(InteractionData interactionData) {
		this.interactionData = interactionData;
	}

	public String getGuildId() {
		return guildId;
	}

	public void setGuildId(String guildId) {
		this.guildId = guildId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public GuildMember getGuildMember() {
		return guildMember;
	}

	public void setGuildMember(GuildMember guildMember) {
		this.guildMember = guildMember;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getGuildLocale() {
		return guildLocale;
	}

	public void setGuildLocale(String guildLocale) {
		this.guildLocale = guildLocale;
	}
	
}
