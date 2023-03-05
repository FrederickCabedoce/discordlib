package cabedoce.cloud.solutions.discord.discordlib.model.interaction;

import java.util.Map;

import cabedoce.cloud.solutions.discord.discordlib.message.Message;
import cabedoce.cloud.solutions.discord.discordlib.model.Attachment;
import cabedoce.cloud.solutions.discord.discordlib.model.Channel;
import cabedoce.cloud.solutions.discord.discordlib.model.GuildMember;
import cabedoce.cloud.solutions.discord.discordlib.model.Role;
import cabedoce.cloud.solutions.discord.discordlib.model.User;

public class ResolvedData {

	public Map<String, User> users;
	
	public Map<String, GuildMember> guildMembers;
	
	public Map<String, Role> roles;
	
	public Map<String, Channel> channels;
	
	public Map<String, Message> messages;
	
	public Map<String, Attachment> attachments;

	@Override
	public String toString() {
		return "ResolvedData [users=" + users + ", guildMembers=" + guildMembers + ", roles=" + roles + ", channels="
				+ channels + ", messages=" + messages + ", attachments=" + attachments + "]";
	}
	
}
