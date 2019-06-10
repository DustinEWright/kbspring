package hello;

public class Kb {
	
	private String title;
	private String keywords;
	private String summary;
	private String solution;
	private String appliesTo;
	
	
	public String getTitle() {
		return title;  // should this be return this.title?
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
	
	
	
	

/*
like personForm

toString title: title

I think this will be similar to PersonForm.java in that it will do what it does and WebController.java will serve this file.
*/
}