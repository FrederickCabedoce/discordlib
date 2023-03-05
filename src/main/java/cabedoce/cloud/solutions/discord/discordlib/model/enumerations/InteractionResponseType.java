package cabedoce.cloud.solutions.discord.discordlib.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InteractionResponseType {
	PONG(1),
	CHANNEL_MESSAGE_WITH_SOURCE(4),
	DEFERRED_CHANNEL_MESSAGE_WITH_SOURCE(5),
	DEFERRED_UPDATE_MESSAGE(6),
	UPDATE_MESSAGE(7),
	APPLICATION_COMMAND_AUTOCOMPLETE_RESULT(8),
	MODAL(9);

	private int value;
	
	InteractionResponseType(int value) {
		this.value = value;
	}
	
	@JsonValue
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
