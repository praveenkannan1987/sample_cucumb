package week3;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import wdMethods.SeMethod;

public class ProjectMethods extends SeMethod {

	@BeforeMethod
	public void login() {
		startApp("chrome", "http://leafTaps.com/opentaps");
		WebElement eleuserName = locateElement("id", "username");
		type(eleuserName, "DemoSalesManager");
		WebElement elepassword = locateElement("id", "password");
		type(elepassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		click(locateElement("linktext", "CRM/SFA"));
	}
	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
}







