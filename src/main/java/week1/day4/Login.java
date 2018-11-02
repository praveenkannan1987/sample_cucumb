package week1.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		//set path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser 
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("http://leafground.com/pages/Alert.html");
		//maximize the browser
		driver.manage().window().maximize();
		//driver.findElementByXPath("//button[text()='Prompt Box']").click();
     	System.out.println(driver.getTitle());
     	Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(4000);
		alert.sendKeys("Test");
		alert.accept();
		//driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
		
		
		


	}

}






