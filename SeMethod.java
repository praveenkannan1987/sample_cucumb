package wdMethods2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethod implements WdMethods{

	public RemoteWebDriver driver ;
	@Override
	public void startApp(String browser, String url) {
		if (browser.equals("chrome")) {			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {			
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" launched Successfully");
	}

	
	@Override
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			}		
		} catch (NullPointerException e) {
			System.err.println("locator value is wrong");
		}catch (NoSuchElementException e) {
			System.err.println("element not found");
			throw new RuntimeException("");
		}catch (WebDriverException e) {
			System.err.println("Something went wrong "+e.getMessage());
		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("the Data "+data+" Entered Successfully");
		} catch (NoSuchElementException e) {
			System.err.println("the Data "+data+" not Entered Successfully");
		}
		catch (WebDriverException e) {
			System.err.println("something went wrong");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void click(WebElement ele) {
	ele.click();
	System.out.println("the Element "+ele+" is clicked Successfully");
	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
     new Select(ele)
     .selectByVisibleText(value);
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}
    public int i =1;
	@Override
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dsc = new  File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, dsc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}

}
