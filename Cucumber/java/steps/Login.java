package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Login {
	ChromeDriver driver;
	@And("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
	}
	@And("Load the URL")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Maximize the browser")
	public void maximize() {
		driver.manage().window().maximize();
	}
	@Given("Set the timeout")
	public void setTheTimeout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Enter username as (.*)")
	public void enterUsernameAsDemoSalesManager(String name) {
		driver.findElementById("username").sendKeys(name);
	}
	/*@Given("Enter username as DemoCSR")
	public void enterUsernameAsDemoCSR() {
		driver.findElementById("username").sendKeys("DemoCSR");
	}*/

	@Given("Enter password as (.*)")
	public void enterPasswordAsCrmsfa(String pass) {
		driver.findElementById("password").sendKeys(pass);
	}

	@When("Click on Loginbutton")
	public void clickOnLoginbutton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify the Welcome message of (.*)")
	public void verifyTheWelcomeMessage(String verifyName) {
		String text = driver.findElementByTagName("h2").getText();
		System.out.println(text);
		if(text.contains(verifyName)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	/*@Then("Verify the Welcome message as B2B")
	public void verifyTheWelcomeMessageAsB2B() {
		String text = driver.findElementByTagName("h2").getText();
		System.out.println(text);
		if(text.contains("B2B")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}



	}*/

}








