package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ProjectMethods extends SeMethods {
    
	public String testcaseName, testDesc, author, category, excelFileName;
	@BeforeSuite(groups="LeaftapsGeneric")
	public void beforeSuite() {
		startResult();
	}
	     
	@BeforeMethod(groups="LeaftapsGeneric")
	public void login() {
		assignTest(testcaseName, testDesc, author, category);
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleuserName = locateElement("id", "username");
		type(eleuserName, "DemoSalesManager");
		WebElement elepassword = locateElement("id", "password");
		type(elepassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		click(locateElement("linktext", "CRM/SFA"));
	}
	@AfterMethod(groups="LeaftapsGeneric")
	public void closeApp() {
		closeBrowser();
	}

	@AfterSuite(groups="LeaftapsGeneric")
	public void afterSuite() {
		endResult();
	}
	
	@DataProvider(name ="fetchData")
	public Object[][] data() throws IOException {
		return ReadExcel.read(excelFileName);
	}
}







