package cabedoce.cloud.solutions.discord.discordlib.model.enumerations;

public enum VideoQuality {
	AUTO(1),
	FULL(2);

	private int value;
	
	VideoQuality(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
