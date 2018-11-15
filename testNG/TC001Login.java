package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC001Login{

	@Test(invocationCount = 3,threadPoolSize=4)
	public void login() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		//driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoCSR");
		//System.out.println("The browser "+browser+" launched successfully");
		//System.out.println("The browser "+browser+" launched successfully");
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);*/
	}

}












