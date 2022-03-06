package cabedoce.cloud.solutions.discordlib.message;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;

import cabedoce.cloud.solutions.discordlib.model.Component;
import cabedoce.cloud.solutions.discordlib.model.Mentions;
import cabedoce.cloud.solutions.discordlib.model.interaction.InteractionCallback;

public class Message extends InteractionCallback {

	public boolean textToSpeech;

	public String content;
	
	public String[] embed;
	
	public Mentions allowed_mentions;
	
	public List<Component> components;
	
	@JsonGetter("tts")
	public boolean isTextToSpeech() {
		return textToSpeech;
	}
	
	@Override
	public String toString() {
		return "Message [textToSpeech=" + textToSpeech + ", content=" + content + ", embed=" + Arrays.toString(embed)
				+ ", allowed_mentions=" + allowed_mentions + ", components=" + components + "]";
	}

	public void setTextToSpeech(boolean textToSpeech) {
		this.textToSpeech = textToSpeech;
	}
	
	@JsonGetter("content")
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public String[] getEmbed() {
		return embed;
	}

	public void setEmbed(String[] embed) {
		this.embed = embed;
	}

	public Mentions getAllowed_mentions() {
		return allowed_mentions;
	}

	public void setAllowed_mentions(Mentions allowed_mentions) {
		this.allowed_mentions = allowed_mentions;
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}
	
}
