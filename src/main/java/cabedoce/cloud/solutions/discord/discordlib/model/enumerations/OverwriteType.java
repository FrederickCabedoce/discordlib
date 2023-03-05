package cabedoce.cloud.solutions.discord.discordlib.model.enumerations;

public enum OverwriteType {
	ROLE(0),
	MEMBER(1);

	private int value;
	
	OverwriteType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
