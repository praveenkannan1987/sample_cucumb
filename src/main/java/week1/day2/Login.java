package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		//set path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser 
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		//maximize the browser
		driver.manage().window().maximize();
		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//enter password
		WebElement elePassword = driver.findElementById("password");
		elePassword.sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
        Select sel = new Select(source);
       // sel.selectByVisibleText("Other");
        //sel.selectByIndex(4);
        sel.selectByValue("LEAD_WORDOFMOUTH");
       
        

	}

}






