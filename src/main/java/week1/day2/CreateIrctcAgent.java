package week1.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateIrctcAgent {
	public static ChromeDriver driver=null;
	public static WebDriverWait wait;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 
		CreateIrctcAgent obj = new CreateIrctcAgent();
		driver =  obj.initialize(driver);
		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		driver.findElementByXPath("//a[contains(text(),'Sign up')]").click();
		driver = obj.fillForm(driver);
		File screenshotFile  = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("./screenshots/irctc.png"));

	}
	public ChromeDriver initialize(ChromeDriver driver) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	public ChromeDriver fillForm(ChromeDriver driver) throws InterruptedException {
		driver.findElementById("userRegistrationForm:userName").sendKeys("TESTId",Keys.TAB);
/*		driver.findElementById("//a[@id='userRegistrationForm:checkavail']").click();
		String strAvail = driver.findElementByXPath("//label[@id='userRegistrationForm:useravail']").getText();
		if(!strAvail.contains("User Id is Available")) {
			System.out.println("Inside Close..");
			driver.close();
		}*/
		driver.findElementById("userRegistrationForm:password").sendKeys("arjunpass");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("arjunpass");
		selectDropDownValue("userRegistrationForm:securityQ","What is your favorite past-time?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Cricket");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("TestFirstName");
		driver.findElementByXPath("//input[@name='userRegistrationForm:gender' and @value='M']").click();
		driver.findElementByXPath("//input[@name='userRegistrationForm:maritalStatus' and @value='U']").click();
		selectDropDownValue("userRegistrationForm:dobDay","12");
		selectDropDownValue("userRegistrationForm:dobMonth","DEC");
		selectDropDownValue("userRegistrationForm:dateOfBirth","1993");
		selectDropDownValue("userRegistrationForm:occupation","Private");
		selectDropDownValue("userRegistrationForm:countries","India");
		driver.findElementById("userRegistrationForm:email").sendKeys("test@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9222558925");
		selectDropDownValue("userRegistrationForm:nationalityId","India");
		driver.findElementById("userRegistrationForm:address").sendKeys("144");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("625009", Keys.TAB);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeSelected(By.id("userRegistrationForm:cityName")));
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		new Select(city).selectByVisibleText("Madurai");
		/*wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeSelected(city));
		//Thread.sleep(3000);
		selectDropDownValue("userRegistrationForm:cityName","Madurai");*/
        WebElement post = driver.findElementById("userRegistrationForm:postofficeName");
		wait.until(ExpectedConditions.elementToBeClickable(post));
		selectDropDownValue("userRegistrationForm:postofficeName","Anuppanady B.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("42598735");
		return driver;
	}
	
	public void selectDropDownValue(String idLocator , String visibleText) {
		WebElement se = driver.findElementById(idLocator);
		new Select(se).selectByVisibleText(visibleText);
	}

}

