package cabedoce.cloud.solutions.discord.discordlib.model;

import java.sql.Timestamp;

public class ThreadMember {
	
	private String id;
	
	private String userId;
	
	private Timestamp joinTimestamp;
	
	private int flags;
	
	@Override
	public String toString() {
		return "ThreadMember [id=" + id + ", userId=" + userId + ", joinTimestamp=" + joinTimestamp + ", flags=" + flags
				+ "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Timestamp getJoinTimestamp() {
		return joinTimestamp;
	}

	public void setJoinTimestamp(Timestamp joinTimestamp) {
		this.joinTimestamp = joinTimestamp;
	}

	public int getFlags() {
		return flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

}
