package challenge;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFileUsingFileDetector {
	@Test
	public void upload() throws MalformedURLException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		WebElement upload = driver.findElementByXPath("//input[@type='file']");
//		upload.sendKeys("C:\\Users\\dell\\Desktop\\a.pdf");
	}
}
















