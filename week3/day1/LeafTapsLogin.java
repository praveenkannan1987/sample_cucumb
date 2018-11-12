package week3.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

	public static void name() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dsc = new  File("./snaps/img.png");
		FileUtils.copyFile(src, dsc); 
		
		
		/*try {
			driver.findElementById("username1").sendKeys("DemoSalesManager");
		} catch (WebDriverException e) {
			System.err.println("element not found");
			throw new RuntimeException();
		}
	    driver.findElementById("password").sendKeys("crmsfa");
	    driver.findElementByClassName("decorativeSubmit").click();*/
	
	
	
	
	
	
	
	
	}
}









