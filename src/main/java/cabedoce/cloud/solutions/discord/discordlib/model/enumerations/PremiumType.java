package cabedoce.cloud.solutions.discord.discordlib.model.enumerations;

public enum PremiumType {
	NONE(0),
	NITRO_CLASSIC(1),
	NITRO(2);

	private int value;
	
	PremiumType(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
