package cabedoce.cloud.solutions.discord.discordlib.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import cabedoce.cloud.solutions.discord.discordlib.model.enumerations.PremiumType;
import cabedoce.cloud.solutions.discord.discordlib.model.enumerations.UserFlags;

public class User {
	
	@JsonProperty
	private String id;
	
	@JsonProperty
	private String username;
	
	@JsonProperty
	private String discriminator;
	
	@JsonProperty
	private String avatar;
	
	@JsonProperty("bot")
	private boolean isBot;
	
	@JsonProperty("system")
	private boolean isSystem;
	
	@JsonProperty("mfa_enabled")
	private boolean isMFAEnabled;
	
	@JsonProperty
	private String banner;
	
	@JsonProperty("accent_color")
	private int accentColor;
	
	@JsonProperty
	private String locale;
	
	@JsonProperty("verified")
	private boolean isVerified;
	
	@JsonProperty
	private String email;
	
	@JsonProperty
	private Set<UserFlags> flags;
	
	@JsonProperty("premium_type")
	private PremiumType premiumType;
	
	@JsonProperty("public_flags")
	private UserFlags publicFlags;

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", discriminator=" + discriminator + ", avatar=" + avatar
				+ ", isBot=" + isBot + ", isSystem=" + isSystem + ", isMFAEnabled=" + isMFAEnabled + ", banner="
				+ banner + ", accentColor=" + accentColor + ", locale=" + locale + ", isVerified=" + isVerified
				+ ", email=" + email + ", flags=" + flags + ", premiumType=" + premiumType + ", publicFlags="
				+ publicFlags + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public boolean isBot() {
		return isBot;
	}

	public void setBot(boolean isBot) {
		this.isBot = isBot;
	}

	public boolean isSystem() {
		return isSystem;
	}

	public void setSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public boolean isMFAEnabled() {
		return isMFAEnabled;
	}

	public void setMFAEnabled(boolean isMFAEnabled) {
		this.isMFAEnabled = isMFAEnabled;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public int getAccentColor() {
		return accentColor;
	}

	public void setAccentColor(int accentColor) {
		this.accentColor = accentColor;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<UserFlags> getFlags() {
		return flags;
	}

	public void setFlags(Set<UserFlags> flags) {
		this.flags = flags;
	}

	public PremiumType getPremiumType() {
		return premiumType;
	}

	public void setPremiumType(PremiumType premiumType) {
		this.premiumType = premiumType;
	}

	public UserFlags getPublicFlags() {
		return publicFlags;
	}

	public void setPublicFlags(UserFlags publicFlags) {
		this.publicFlags = publicFlags;
	}
}
