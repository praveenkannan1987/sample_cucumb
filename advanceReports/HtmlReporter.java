package advanceReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class HtmlReporter {

	static ExtentHtmlReporter html;
	static ExtentReports extent;
	ExtentTest test;
	//before suite
	public void startResult() {
		html = new ExtentHtmlReporter("./reports/extentReport.html");
		html.setAppendExisting(true); 
		html.loadXMLConfig("./Config.xml");  
		extent= new ExtentReports(); 
		extent.attachReporter(html);
	}
	//before method for each testcase
	public void assignTest(String testcaseName, String testDesc, String author, String category) {
		test = extent.createTest(testcaseName,testDesc );
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	//in try catch block
	public void logSteps(String status, String log) {
		if(status.equalsIgnoreCase("pass")) {
			test.pass(log);
		} else if(status.equalsIgnoreCase("fail")) {
			test.fail(log);
		}  else if(status.equalsIgnoreCase("warning")) {
			test.warning(log);
		}
	}
    //after suite
	public void endResult() {
		extent.flush(); 
	}
}






