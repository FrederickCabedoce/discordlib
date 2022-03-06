package cabedoce.cloud.solutions.discordlib.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ApplicationCommandType {
	CHAT_INPUT(1),
	USER(2),
	MESSAGE(3);

	public int value;
	
	ApplicationCommandType(int value) {
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
