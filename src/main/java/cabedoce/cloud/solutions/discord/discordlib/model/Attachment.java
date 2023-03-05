package cabedoce.cloud.solutions.discord.discordlib.model;

public class Attachment {

	private String id;
	
	private String filename;
	
	private String description;
	
	private String contentType;
	
	private int size;
	
	private String url;
	
	private String proxyUrl;
	
	private int height;
	
	private int width;
	
	private boolean isEphemeral;

	@Override
	public String toString() {
		return "Attachment [id=" + id + ", filename=" + filename + ", description=" + description + ", contentType="
				+ contentType + ", size=" + size + ", url=" + url + ", proxyUrl=" + proxyUrl + ", height=" + height
				+ ", width=" + width + ", isEphemeral=" + isEphemeral + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProxyUrl() {
		return proxyUrl;
	}

	public void setProxyUrl(String proxyUrl) {
		this.proxyUrl = proxyUrl;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isEphemeral() {
		return isEphemeral;
	}

	public void setEphemeral(boolean isEphemeral) {
		this.isEphemeral = isEphemeral;
	}
	
}
