package challenge;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLight {

	public static void main(String[] args) throws InterruptedException, AWTException{
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("http://leaftaps.com/opentaps");
		WebElement button = driver.findElementById("username");

		for (int i = 0; i <= 10; i++) {
			driver.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",button);
			Thread.sleep(250);
			driver.executeScript("arguments[0].setAttribute('style','background: red');", button);
			Thread.sleep(250);
		}
//		driver.quit();
	}

}
