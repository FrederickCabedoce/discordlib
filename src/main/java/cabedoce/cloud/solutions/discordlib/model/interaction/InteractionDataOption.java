package cabedoce.cloud.solutions.discordlib.model.interaction;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InteractionDataOption {
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private int type;
	
	@JsonProperty
	private String value;
	
	@JsonProperty
	private List<InteractionDataOption> options;
	
	@JsonProperty("focused")
	private boolean isFocused;

	@Override
	public String toString() {
		return "InteractionDataOption [name=" + name + ", type=" + type + ", value=" + value + ", options=" + options
				+ ", isFocused=" + isFocused + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<InteractionDataOption> getOptions() {
		return options;
	}

	public void setOptions(List<InteractionDataOption> options) {
		this.options = options;
	}

	public boolean isFocused() {
		return isFocused;
	}

	public void setFocused(boolean isFocused) {
		this.isFocused = isFocused;
	}
}
