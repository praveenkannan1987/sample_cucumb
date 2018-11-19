package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethod {
    
	public String testcaseName, testDesc, author, category;
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

	@BeforeSuite
	public void beforeSuite() {
		startResult();
	}

	@AfterSuite
	public void afterSuite() {
		endResult();
	}
}







