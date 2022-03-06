package cabedoce.cloud.solutions.discordlib.model;

import java.sql.Timestamp;
import java.util.Set;

import cabedoce.cloud.solutions.discordlib.model.enumerations.ArchiveDuration;
import cabedoce.cloud.solutions.discordlib.model.enumerations.ChannelType;

public class Channel {

	private String id;
	
	private ChannelType channelType;
	
	private String guildId;
	
	private int position;
	
	private Set<Overwrite> overwriteSet;
	
	private String name;
	
	private String topic;
	
	private boolean isNsfw;
	
	private String lastMessageId;
	
	private int bitrate;
	
	private int userLimit;
	
	private int rateLimitPerUser;

	private Set<User> messageRecipients;
	
	private String icon;
	
	private String ownerId;
	
	private String applicationId;
	
	private String parentId;
	
	private Timestamp lastPinTimestamp;
	
	private String rtcRegion;
	
	private int videoQualityMode;
	
	private int messageCount;
	
	private int memberCount;
	
	private ThreadMetadata threadMetadata;
	
	private ThreadMember threadMember;
	
	private ArchiveDuration archiveDuration;
	
	private String permissions;

	@Override
	public String toString() {
		return "Channel [id=" + id + ", channelType=" + channelType + ", guildId=" + guildId + ", position=" + position
				+ ", overwriteSet=" + overwriteSet + ", name=" + name + ", topic=" + topic + ", isNsfw=" + isNsfw
				+ ", lastMessageId=" + lastMessageId + ", bitrate=" + bitrate + ", userLimit=" + userLimit
				+ ", rateLimitPerUser=" + rateLimitPerUser + ", messageRecipients=" + messageRecipients + ", icon="
				+ icon + ", ownerId=" + ownerId + ", applicationId=" + applicationId + ", parentId=" + parentId
				+ ", lastPinTimestamp=" + lastPinTimestamp + ", rtcRegion=" + rtcRegion + ", videoQualityMode="
				+ videoQualityMode + ", messageCount=" + messageCount + ", memberCount=" + memberCount
				+ ", threadMetadata=" + threadMetadata + ", threadMember=" + threadMember + ", archiveDuration="
				+ archiveDuration + ", permissions=" + permissions + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ChannelType getChannelType() {
		return channelType;
	}

	public void setChannelType(ChannelType channelType) {
		this.channelType = channelType;
	}

	public String getGuildId() {
		return guildId;
	}

	public void setGuildId(String guildId) {
		this.guildId = guildId;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Set<Overwrite> getOverwriteSet() {
		return overwriteSet;
	}

	public void setOverwriteSet(Set<Overwrite> overwriteSet) {
		this.overwriteSet = overwriteSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public boolean isNsfw() {
		return isNsfw;
	}

	public void setNsfw(boolean isNsfw) {
		this.isNsfw = isNsfw;
	}

	public String getLastMessageId() {
		return lastMessageId;
	}

	public void setLastMessageId(String lastMessageId) {
		this.lastMessageId = lastMessageId;
	}

	public int getBitrate() {
		return bitrate;
	}

	public void setBitrate(int bitrate) {
		this.bitrate = bitrate;
	}

	public int getUserLimit() {
		return userLimit;
	}

	public void setUserLimit(int userLimit) {
		this.userLimit = userLimit;
	}

	public int getRateLimitPerUser() {
		return rateLimitPerUser;
	}

	public void setRateLimitPerUser(int rateLimitPerUser) {
		this.rateLimitPerUser = rateLimitPerUser;
	}

	public Set<User> getMessageRecipients() {
		return messageRecipients;
	}

	public void setMessageRecipients(Set<User> messageRecipients) {
		this.messageRecipients = messageRecipients;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Timestamp getLastPinTimestamp() {
		return lastPinTimestamp;
	}

	public void setLastPinTimestamp(Timestamp lastPinTimestamp) {
		this.lastPinTimestamp = lastPinTimestamp;
	}

	public String getRtcRegion() {
		return rtcRegion;
	}

	public void setRtcRegion(String rtcRegion) {
		this.rtcRegion = rtcRegion;
	}

	public int getVideoQualityMode() {
		return videoQualityMode;
	}

	public void setVideoQualityMode(int videoQualityMode) {
		this.videoQualityMode = videoQualityMode;
	}

	public int getMessageCount() {
		return messageCount;
	}

	public void setMessageCount(int messageCount) {
		this.messageCount = messageCount;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}

	public ThreadMetadata getThreadMetadata() {
		return threadMetadata;
	}

	public void setThreadMetadata(ThreadMetadata threadMetadata) {
		this.threadMetadata = threadMetadata;
	}

	public ThreadMember getThreadMember() {
		return threadMember;
	}

	public void setThreadMember(ThreadMember threadMember) {
		this.threadMember = threadMember;
	}

	public ArchiveDuration getArchiveDuration() {
		return archiveDuration;
	}

	public void setArchiveDuration(ArchiveDuration archiveDuration) {
		this.archiveDuration = archiveDuration;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
}
