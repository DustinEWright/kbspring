package hello;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class DataAccessObject {

	public static long kbNumber() {
		Date date = new Date();
		long timeStamp = date.getTime();
		return timeStamp;
	}

	// May move kbNumber() and setup getters & setters so that attribute can be accessed like the others.
	
	public void saveKb(String fileName, Kb article) {
		String kbData = "KBA-" + kbNumber() + " " + article.getTitle() + ", " + article.getKeywords() + ", " + article.getSummary() + ", "
				+ article.getSolution() + ", " + article.getAppliesTo();

		try {
			FileWriter fileWriter = new FileWriter(fileName, true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(kbData);
			printWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
