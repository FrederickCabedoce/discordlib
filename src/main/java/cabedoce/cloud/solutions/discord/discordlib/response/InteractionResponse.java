package cabedoce.cloud.solutions.discord.discordlib.response;

import cabedoce.cloud.solutions.discord.discordlib.model.enumerations.InteractionResponseType;
import cabedoce.cloud.solutions.discord.discordlib.model.interaction.InteractionCallback;

public class InteractionResponse {

	private InteractionResponseType type;
	
	private InteractionCallback data;

	@Override
	public String toString() {
		return "InteractionResponse [type=" + type + ", data=" + data + "]";
	}

	public InteractionResponseType getType() {
		return type;
	}

	public void setType(InteractionResponseType type) {
		this.type = type;
	}

	public InteractionCallback getData() {
		return data;
	}

	public void setData(InteractionCallback data) {
		this.data = data;
	}
	
}
