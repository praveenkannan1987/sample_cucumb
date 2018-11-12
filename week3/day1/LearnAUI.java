package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement draggable;
		try {
			draggable = driver.findElementById("draggable1");
		} catch (NoSuchElementException e) {
			System.err.println("element not found");
		}
		WebElement droppable = driver.findElementById("droppable");
		System.out.println(droppable.getLocation());
		Actions builder = new Actions(driver);
		//builder.dragAndDrop(draggable, droppable).perform();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		builder.moveToElement(electronics).perform();
		driver.findElementByLinkText("Lens").click();
		

	}

}








