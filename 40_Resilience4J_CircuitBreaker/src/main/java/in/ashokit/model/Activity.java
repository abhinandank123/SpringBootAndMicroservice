package in.ashokit.model;

public class Activity {
	
	private String secret;
	private String activity;
	private String type;
	private String link;
	private String key;
	private Integer participants;
	private Double price;
	private Double accessibility;
	
	
	
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Integer getParticipants() {
		return participants;
	}
	public void setParticipants(Integer participants) {
		this.participants = participants;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getAccessibility() {
		return accessibility;
	}
	public void setAccessibility(Double accessibility) {
		this.accessibility = accessibility;
	}
	@Override
	public String toString() {
		return "Activity [secret=" + secret + ", activity=" + activity + ", type=" + type + ", link=" + link + ", key="
				+ key + ", participants=" + participants + ", price=" + price + ", accessibility=" + accessibility
				+ "]";
	}
	
	

}
