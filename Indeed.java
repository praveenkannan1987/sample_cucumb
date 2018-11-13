package projectDayTestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Indeed {
	ChromeDriver driver;
	Actions builder;

	@Test
	public void indeed() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.indeed.co.in/Fresher-jobs");
		// driver.findElementByXPath("//button[text()='Dismiss']").click();
		List<WebElement> joblinks = driver
				.findElementsByXPath("(//td[@id='resultsCol'])//a[@data-tn-element='jobTitle']");
		System.out.println(joblinks.size());
		for (WebElement clcikOneByOne : joblinks) {
			openInNewTab(clcikOneByOne);
			switchToWindow(1);
			System.out.println(driver.getTitle() + "\n");
			driver.close();
			switchToWindow(0);
		}
		driver.quit();
	}

	public void switchToWindow(int index) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> allHandles = new ArrayList<String>();
		allHandles.addAll(allWindowHandles);
		driver.switchTo().window(allHandles.get(index));
	}

	public void openInNewTab(WebElement ele) {
		builder = new Actions(driver);
		builder.sendKeys(ele, Keys.CONTROL).click(ele).perform();
	}
	
	
}
