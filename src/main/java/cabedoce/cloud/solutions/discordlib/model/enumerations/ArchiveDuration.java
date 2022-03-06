package cabedoce.cloud.solutions.discordlib.model.enumerations;

public enum ArchiveDuration {
	VERYSHORT(60),
	SHORT(1440),
	MEDIUM(4320),
	LONG(10080);

	public int value;
	
	ArchiveDuration(int value) {
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
