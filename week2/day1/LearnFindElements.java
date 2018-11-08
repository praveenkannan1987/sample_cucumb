package week2.day1;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnFindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.crystalcruises.com/cruises/calendar?year=2018");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> allElements = driver.findElementsByLinkText("Request A Quote".toUpperCase());
		System.out.println(allElements.size());
		for (WebElement eachElement : allElements) {
			System.out.println(eachElement.getText());
		}
		allElements.get(4).click();
	}

}








