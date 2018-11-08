package week2.day1;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroopDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		WebElement elePassword = driver.findElementById("password");
		elePassword.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		// Identify the webElement
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		source.sendKeys("D");
		// Pass the webelement in the Select constructor
		Select sel = new Select(source);
		
//		sel.selectByIndex(3);
		/*WebElement firstSelectedOption = sel.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		List<WebElement> options = sel.getOptions();
		for(WebElement op: options) {
			String eachOpt = op.getText();
			System.out.println(eachOpt);
		}
		System.out.println(options.size());
		sel.selectByIndex(options.size() -1);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
