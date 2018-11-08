package week2.day1;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsCW {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByName("q").sendKeys("sarath", Keys.ENTER);
		// using partialLinkTetxt
		List<WebElement> partial = driver
				.findElementsByPartialLinkText("Sarath");
		System.out.println("Available links: "+partial.size());
		for (WebElement eachNameLink : partial) {
			System.out.println(eachNameLink.getText());
		}
		// using xpath
		List<WebElement> names = driver.findElementsByXPath("//h3[contains(text(),'Sarath')]");
				System.out.println("Available links: "+names.size());
				for (WebElement eachNameLink : names) {
					System.out.println(eachNameLink.getText());
				}
				names.get(3).click();
				System.out.println("Title: "+driver.getTitle());
	}

}








