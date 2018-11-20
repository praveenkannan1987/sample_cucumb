package advanceReports;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class HtmlReporter {

	static ExtentHtmlReporter html;
	static ExtentReports extent;
	ExtentTest test;
	//before suite
	public void startResult() {
		html = new ExtentHtmlReporter("./reports/extentReport.html");
		html.setAppendExisting(true); 
		//		html.loadXMLConfig("./Config.xml");  
		extent= new ExtentReports(); 
		extent.attachReporter(html);
	}
	//before method for each testcase
	public void assignTest(String testcaseName, String testDesc, String author, String category) {
		test = extent.createTest(testcaseName,testDesc );
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	public abstract long takeSnap();
	public void logSteps(String status, String log) {
		logSteps(status, log, true);  
	}
	//in try catch block
	public void logSteps(String status, String log, boolean bSnap) {
		MediaEntityModelProvider build = null;
		if (bSnap == true) {
			long takeSnap = 100000L;
			takeSnap = takeSnap();
			System.out.println(takeSnap);
			build = null;
			try {
				build = MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img" + takeSnap + ".png").build();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		if(status.equalsIgnoreCase("pass")) {
			test.pass(log, build );
		} else if(status.equalsIgnoreCase("fail")) {
			test.fail(log, build);
		}  else if(status.equalsIgnoreCase("warning")) {
			test.warning(log, build);
		}
	}
	//after suite
	public void endResult() {
		extent.flush(); 
	}
}






