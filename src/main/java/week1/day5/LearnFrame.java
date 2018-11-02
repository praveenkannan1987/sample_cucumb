package week1.day5;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser 
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("http://jqueryui.com/draggable/");
		//maximize the browser
		driver.manage().window().maximize();
		//switch to frame
		driver.switchTo().frame(0);
		WebElement element = driver.findElementById("");
		driver.switchTo().frame(element);
		String text = driver.findElementById("draggable").getText();
        System.out.println(text);
        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.findElementByLinkText("Sortable").click();
	}

}



