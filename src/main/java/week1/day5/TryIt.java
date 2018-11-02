package week1.day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryIt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser 
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//maximize the browser
		driver.manage().window().maximize();
		//switch to frame
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		String data = "koushik";
		// switch to alert
		Alert alert = driver.switchTo().alert();
		// pass the value
		alert.sendKeys(data);
		//accept alert
		alert.accept();		
		// get text to check
		String text = driver.findElementById("demo").getText();
		if(text.contains(data)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}

		driver.quit();







	}

}
