package cabedoce.cloud.solutions.discordlib.model;

import java.util.Set;

public class Role {
	//https://discord.com/developers/docs/topics/permissions#role-object
	
	private String id;
	
	private String name;
	
	//color
	private int hexadecimalColorCode;
	
	//hoist
	private String isPinned;
	
	private String icon;
	
	//unicode_emoji
	private String unicodeEmoji;
	
	private int position;
	
	private String permissions;
	
	//managed
	private boolean isManaged;
	//mentionable
	private boolean isMentionable;
	
	private Set<RoleTag> roleTags;

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", hexadecimalColorCode=" + hexadecimalColorCode + ", isPinned="
				+ isPinned + ", icon=" + icon + ", unicodeEmoji=" + unicodeEmoji + ", position=" + position
				+ ", permissions=" + permissions + ", isManaged=" + isManaged + ", isMentionable=" + isMentionable
				+ ", roleTags=" + roleTags + "]";
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

	public int getHexadecimalColorCode() {
		return hexadecimalColorCode;
	}

	public void setHexadecimalColorCode(int hexadecimalColorCode) {
		this.hexadecimalColorCode = hexadecimalColorCode;
	}

	public String getIsPinned() {
		return isPinned;
	}

	public void setIsPinned(String isPinned) {
		this.isPinned = isPinned;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUnicodeEmoji() {
		return unicodeEmoji;
	}

	public void setUnicodeEmoji(String unicodeEmoji) {
		this.unicodeEmoji = unicodeEmoji;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public boolean isManaged() {
		return isManaged;
	}

	public void setManaged(boolean isManaged) {
		this.isManaged = isManaged;
	}

	public boolean isMentionable() {
		return isMentionable;
	}

	public void setMentionable(boolean isMentionable) {
		this.isMentionable = isMentionable;
	}

	public Set<RoleTag> getRoleTags() {
		return roleTags;
	}

	public void setRoleTags(Set<RoleTag> roleTags) {
		this.roleTags = roleTags;
	}

}
