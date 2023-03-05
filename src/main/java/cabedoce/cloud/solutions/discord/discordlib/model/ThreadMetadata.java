package cabedoce.cloud.solutions.discord.discordlib.model;

import java.sql.Timestamp;

import cabedoce.cloud.solutions.discord.discordlib.model.enumerations.ArchiveDuration;

public class ThreadMetadata {

	public boolean isArchived;
	
	public ArchiveDuration autoArchiveDuration;
	
	public Timestamp archiveTimestamp;
	
	public boolean isLocked;
	
	public boolean isInvitable;
	
	public Timestamp creationDate;

	@Override
	public String toString() {
		return "ThreadMetadata [isArchived=" + isArchived + ", autoArchiveDuration=" + autoArchiveDuration
				+ ", archiveTimestamp=" + archiveTimestamp + ", isLocked=" + isLocked + ", isInvitable=" + isInvitable
				+ ", creationDate=" + creationDate + "]";
	}

	public boolean isArchived() {
		return isArchived;
	}

	public void setArchived(boolean isArchived) {
		this.isArchived = isArchived;
	}

	public ArchiveDuration getAutoArchiveDuration() {
		return autoArchiveDuration;
	}

	public void setAutoArchiveDuration(ArchiveDuration autoArchiveDuration) {
		this.autoArchiveDuration = autoArchiveDuration;
	}

	public Timestamp getArchiveTimestamp() {
		return archiveTimestamp;
	}

	public void setArchiveTimestamp(Timestamp archiveTimestamp) {
		this.archiveTimestamp = archiveTimestamp;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public boolean isInvitable() {
		return isInvitable;
	}

	public void setInvitable(boolean isInvitable) {
		this.isInvitable = isInvitable;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	
}
