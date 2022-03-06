package cabedoce.cloud.solutions.discordlib.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Mentions {

	String[] parse = new String[1];
	
	@Override
	public String toString() {
		return "Mentions [parse=" + Arrays.toString(parse) + "]";
	}

	@JsonGetter
	public String[] getParse() {
		return parse;
	}
}
