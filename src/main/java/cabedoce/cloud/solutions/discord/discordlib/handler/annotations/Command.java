package cabedoce.cloud.solutions.discord.discordlib.handler.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Command {
	public String name();
}
