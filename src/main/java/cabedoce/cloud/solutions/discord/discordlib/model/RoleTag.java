package cabedoce.cloud.solutions.discord.discordlib.model;

public class RoleTag {
	private String botId;
	private String integrationId;
	private String premium_subscriber = null;
	
	@Override
	public String toString() {
		return "RoleTag [botId=" + botId + ", integrationId=" + integrationId + ", premium_subscriber="
				+ premium_subscriber + "]";
	}
	public String getBotId() {
		return botId;
	}
	public void setBotId(String botId) {
		this.botId = botId;
	}
	public String getIntegrationId() {
		return integrationId;
	}
	public void setIntegrationId(String integrationId) {
		this.integrationId = integrationId;
	}
	public String getPremium_subscriber() {
		return premium_subscriber;
	}
	public void setPremium_subscriber(String premium_subscriber) {
		this.premium_subscriber = premium_subscriber;
	}
}
