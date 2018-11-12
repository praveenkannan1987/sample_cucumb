package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement src = driver.findElementById("draggable");
		Point location = src.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("X value: "+x +"Y value: " +y);
		act.dragAndDropBy(src, x+20, y+30).perform();
		WebElement afterDrag = driver.findElementById("draggable");
		System.out.println("after dragging: "+afterDrag.getLocation().getX());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
