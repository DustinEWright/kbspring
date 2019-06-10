package hello;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Kb {
	
	private String title;
	private String keywords;
	private String summary;
	private String solution;
	private String appliesTo;
	
	
	public String getTitle() {
		return title;  // should the getters be return this.variable?
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
	        return "KB Article: (Title: " + this.title + ", Keywords: " + this.keywords + ", Summary: " + this.summary + ", Solution: " + this.solution + ", Applies To: " + this.appliesTo + ")";
	    }

	    public void saveKb(String fileName, PersonForm person) {        
	            String kbData = "KBA-" + kbNumber() + " " + getTitle() + ", " +  getKeywords() + ", " + getSummary() + ", " + getSolution() + ", " + getAppliesTo();
	            
	            try {
	                FileWriter fileWriter = new FileWriter(fileName, true);
	                PrintWriter printWriter = new PrintWriter(fileWriter);
	                printWriter.println(kbData);
	                printWriter.close();                
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	
	
	

/*
like personForm

toString title: title

I think this will be similar to PersonForm.java in that it will do what it does and WebController.java will serve this file.
*/
}