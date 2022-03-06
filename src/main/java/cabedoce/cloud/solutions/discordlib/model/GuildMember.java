package cabedoce.cloud.solutions.discordlib.model;

import java.sql.Timestamp;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GuildMember {
	
	@JsonProperty
	public User user;
	
	@JsonProperty
	public String nick;
	
	@JsonProperty
	public String avatar;
	
	@JsonProperty
	public Set<String> roles;
	
	@JsonProperty
	public Timestamp joined_at;
	
	@JsonProperty
	public Timestamp premium_since;
	
	@JsonProperty("deaf")
	public boolean isDeaf;
	
	@JsonProperty("mute")
	public boolean isMute;
	
	@JsonProperty
	public boolean pending;
	
	@JsonProperty("is_pending")
	public boolean isPending;

	@JsonProperty
	public String permissions;
	
	@JsonProperty("communication_disabled_until")
	public Timestamp communicationDisabledUntil;

	@Override
	public String toString() {
		return "GuildMember [user=" + user + ", nick=" + nick + ", avatar=" + avatar + ", roles=" + roles
				+ ", joined_at=" + joined_at + ", premium_since=" + premium_since + ", isDeaf=" + isDeaf + ", isMute="
				+ isMute + ", pending=" + pending + ", isPending=" + isPending + ", permissions=" + permissions
				+ ", communicationDisabledUntil=" + communicationDisabledUntil + "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	public Timestamp getJoined_at() {
		return joined_at;
	}

	public void setJoined_at(Timestamp joined_at) {
		this.joined_at = joined_at;
	}

	public Timestamp getPremium_since() {
		return premium_since;
	}

	public void setPremium_since(Timestamp premium_since) {
		this.premium_since = premium_since;
	}

	public boolean isDeaf() {
		return isDeaf;
	}

	public void setDeaf(boolean isDeaf) {
		this.isDeaf = isDeaf;
	}

	public boolean isMute() {
		return isMute;
	}

	public void setMute(boolean isMute) {
		this.isMute = isMute;
	}

	public boolean isPending() {
		return pending;
	}

	public void setPending(boolean pending) {
		this.pending = pending;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public Timestamp getCommunicationDisabledUntil() {
		return communicationDisabledUntil;
	}

	public void setCommunicationDisabledUntil(Timestamp communicationDisabledUntil) {
		this.communicationDisabledUntil = communicationDisabledUntil;
	}
}
