package cabedoce.cloud.solutions.discordlib.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InteractionType {
	PONG(1),
	APPLICATION_COMMAND(2),
	MESSAGE_COMPONENT(3),
	APPLICATION_COMMAND_AUTOCOMPLETE(4),
	MODAL_SUBMIT(5);
	
	private int value;
	
	private InteractionType(int value) {
		this.value = value;	}
	
	@JsonValue
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
}
