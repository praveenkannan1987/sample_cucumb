package advanceReports;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods {
    
	public String testcaseName, testDesc, author, category;
	@BeforeSuite
	public void beforeSuite() {
		startResult();
	}
	@Parameters({"browser","url","username","password"})     
	@BeforeMethod
	public void login(String browser,String url, String uname, String pwd) {
		assignTest(testcaseName, testDesc, author, category);
		startApp(browser, url);
		WebElement eleuserName = locateElement("id", "username");
		type(eleuserName, uname);
		WebElement elepassword = locateElement("id", "password");
		type(elepassword, pwd);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		click(locateElement("linktext", "CRM/SFA"));
	}
	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}

	@AfterSuite
	public void afterSuite() {
		endResult();
	}
}







