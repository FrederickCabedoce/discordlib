package cabedoce.cloud.solutions.discordlib.model.interaction;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cabedoce.cloud.solutions.discordlib.model.enumerations.ApplicationCommandType;

public class InteractionData {
	
	@JsonProperty
	public String id;
	
	@JsonProperty
	public String name;
	
	@JsonProperty("type")
	public ApplicationCommandType applicationCommandType;
	
	@JsonProperty
	public ResolvedData resolvedData;
	
	@JsonProperty
	private List<InteractionDataOption> options;

	@Override
	public String toString() {
		return "InteractionData [id=" + id + ", name=" + name + ", applicationCommandType=" + applicationCommandType
				+ ", resolvedData=" + resolvedData + ", options=" + options + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ApplicationCommandType getApplicationCommandType() {
		return applicationCommandType;
	}

	public void setApplicationCommandType(ApplicationCommandType applicationCommandType) {
		this.applicationCommandType = applicationCommandType;
	}

	public ResolvedData getResolvedData() {
		return resolvedData;
	}

	public void setResolvedData(ResolvedData resolvedData) {
		this.resolvedData = resolvedData;
	}

	public List<InteractionDataOption> getOptions() {
		return options;
	}

	public void setOptions(List<InteractionDataOption> options) {
		this.options = options;
	}

}
