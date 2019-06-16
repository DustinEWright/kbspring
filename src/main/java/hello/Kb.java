package hello;

import java.util.Date;

public class Kb {

	private Long kbNumber;
	private String title;
	private String keywords;
	private String summary;
	private String solution;
	private String appliesTo;

	public Long getKbNumber() {
		return kbNumber();
	}

	public void setKbNumber(Long kbNumber) {
		this.kbNumber = kbNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getAppliesTo() {
		return appliesTo;
	}

	public void setAppliesTo(String appliesTo) {
		this.appliesTo = appliesTo;
	}

	public static long kbNumber() {
		Date date = new Date();
		long timeStamp = date.getTime();
		return timeStamp;
	}

	public String toString() {
		return "KB Article: (Number: " + this.kbNumber + ", Title: " + this.title + ", Keywords: " + this.keywords
				+ ", Summary: " + this.summary + ", Solution: " + this.solution + ", Applies To: " + this.appliesTo
				+ ")";
		// return "KB Article: (Title: " + this.title + ", Keywords: " + this.keywords +
		// ", Summary: " + this.summary + ", Solution: " + this.solution + ", Applies
		// To: " + this.appliesTo + ")";
	}
}