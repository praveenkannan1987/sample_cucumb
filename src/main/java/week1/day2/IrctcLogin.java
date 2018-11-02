package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IrctcLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverWait wait;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		driver.findElementByXPath("//a[contains(text(),'Sign up')]").click();
		new Select(driver.findElementById("userRegistrationForm:countries")).selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("625009", Keys.TAB);
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated((By.id("userRegistrationForm:cityName"))));
		new Select(driver.findElementById("userRegistrationForm:cityName")).selectByVisibleText("Madurai");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated((By.id("userRegistrationForm:postofficeName"))));
		new Select(driver.findElementById("userRegistrationForm:postofficeName")).selectByVisibleText("Ma Munichalai Road S.O");
		
	}

}
