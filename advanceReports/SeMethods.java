package advanceReports;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;

import reports.HtmlReporter;
import wdMethods.WdMethods;

public class SeMethods extends HtmlReporter implements WdMethods{
	public int i = 1;
	public RemoteWebDriver driver;
	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			logSteps("pass","The browser: "+browser+" launched successfully");
		} catch (UnreachableBrowserException e) {			
			logSteps("fail", "The browser: "+browser+" could not be launched");
		}catch (WebDriverException e) {			
			logSteps("fail", "The browser: "+browser+" could not be launched");
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch(locator) {
			case "id"	 : return driver.findElementById(locValue);
			case "class" : return driver.findElementByClassName(locValue);
			case "name" : return driver.findElementByName(locValue);
			case "linktext" : return driver.findElementByLinkText(locValue);
			case "partialLink" : return driver.findElementByPartialLinkText(locValue);
			case "tagname" : return driver.findElementByTagName(locValue);
			case "xpath" : return driver.findElementByXPath(locValue);
			case "cssSelect" : return driver.findElementByCssSelector(locValue);
			}
		} catch (NoSuchElementException e) {
			logSteps("fail", "The element with locator "+locator+" not found.");
		} catch (WebDriverException e) {
			logSteps("fail", "Unknown exception occured while finding "+locator+" with the value "+locValue);
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			logSteps("pass","The data: "+data+" entered successfully in the field :"+ele);
		} catch (InvalidElementStateException e) {
			logSteps("fail", "The data: "+data+" could not be entered in the field :"+ele);
		} catch (WebDriverException e) {
			logSteps("fail", "Unknown exception occured while entering "+data+" in the field :"+ele);
		}
		finally {
			takeSnap();
		}
	}

	public void clickWithNoSnap(WebElement ele) {
		String text = "";
		try {	
			text = ele.getText();
			ele.click();			
			logSteps("pass", "The element :"+text+"  is clicked.");
		} catch (InvalidElementStateException e) {
			logSteps("fail", "The element: "+text+" could not be clicked");
		} catch (WebDriverException e) {
			logSteps("fail", "Unknown exception occured while clicking in the field");
		} 
	}

	
	public void click(WebElement ele) {
		String text = "";
		try {			
			text = ele.getText();
			ele.click();
			logSteps("pass", "The element "+text+" is clicked");
		} catch (InvalidElementStateException e) {
			logSteps("fail", "The element: "+text+" could not be clicked");
		} catch (WebDriverException e) {
			logSteps("fail", "Unknown exception occured while clicking in the field");
		} 
	}

	public String getText(WebElement ele) {	
		String bReturn = "";
		try {
			bReturn = ele.getText();
		} catch (WebDriverException e) {
			logSteps("fail", "The element: "+ele+" could not be found.");
		}
		return bReturn;
	}

	public String getTitle() {		
		String bReturn = "";
		try {
			bReturn =  driver.getTitle();
		} catch (WebDriverException e) {
			logSteps("fail", "Unknown Exception Occured While fetching Title");
		} 
		return bReturn;
	}
	
	public String getAttribute(WebElement ele, String attribute) {		
		String bReturn = "";
		try {
			bReturn=  ele.getAttribute(attribute);
		} catch (WebDriverException e) {
			logSteps("fail", "The element: "+ele+" could not be found.");
		} 
		return bReturn;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			new Select(ele).selectByVisibleText(value);
			logSteps("pass","The dropdown is selected with text "+value);
		} catch (WebDriverException e) {
			logSteps("fail", "The element: "+ele+" could not be found.");
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			new Select(ele).selectByIndex(index);
			logSteps("pass","The dropdown is selected with index "+index);
		} catch (WebDriverException e) {
			logSteps("fail", "The element: "+ele+" could not be found.");
		} 
	}

	public boolean verifyTitle(String title) {
		boolean bReturn =false;
		try {
			if(getTitle().equals(title)) {
				logSteps("pass", "The title of the page matches with the value :"+title);
				bReturn= true;
			}else {
				logSteps("fail", "The title of the page:"+driver.getTitle()+" did not match with the value :"+title);
			}
		} catch (WebDriverException e) {
			logSteps("fail", "Unknown exception occured while verifying the title");
		} 
		return bReturn;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			if(getText(ele).equals(expectedText)) {
				logSteps("pass","The text: "+getText(ele)+" matches with the value :"+expectedText);
			}else {
				logSteps("fail", "The text "+getText(ele)+" doesn't matches the actual "+expectedText);
			}
		} catch (WebDriverException e) {
			logSteps("fail", "Unknown exception occured while verifying the Text");
		} 

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			if(getText(ele).contains(expectedText)) {
				logSteps("pass","The expected text contains the actual "+expectedText);
			}else {
				logSteps("fail", "The expected text doesn't contain the actual "+expectedText);
			}
		} catch (WebDriverException e) {
			logSteps("fail", "Unknown exception occured while verifying the Text");
		} 
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			if(getAttribute(ele, attribute).equals(value)) {
				logSteps("pass","The expected attribute :"+attribute+" value matches the actual "+value);
			}else {
				logSteps("fail", "The expected attribute :"+attribute+" value does not matches the actual "+value);
			}
		} catch (WebDriverException e) {
			logSteps("fail", "Unknown exception occured while verifying the Attribute Text");
		} 

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			if(getAttribute(ele, attribute).contains(value)) {
				logSteps("pass","The expected attribute :"+attribute+" value contains the actual "+value);
			}else {
				logSteps("fail", "The expected attribute :"+attribute+" value does not contains the actual "+value);
			}
		} catch (WebDriverException e) {
			logSteps("fail", "Unknown exception occured while verifying the Attribute Text");
		}
	}

	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected()) {
				logSteps("pass","The element "+ele+" is selected");
			} else {
				logSteps("fail", "The element "+ele+" is not selected");
			}
		} catch (WebDriverException e) {
			logSteps("fail", "WebDriverException : "+e.getMessage());
		}
	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed()) {
				logSteps("pass","The element "+ele+" is visible");
			} else {
				logSteps("fail","The element "+ele+" is not visible");
			}
		} catch (WebDriverException e) {
			logSteps("fail","WebDriverException : "+e.getMessage());
		} 
	}

	public void switchToWindow(int index) {
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			List<String> allHandles = new ArrayList<>();
			allHandles.addAll(allWindowHandles);
			driver.switchTo().window(allHandles.get(index));
		} catch (NoSuchWindowException e) {
			logSteps("pass", "The driver could not move to the given window by index "+index);
		} catch (WebDriverException e) {
			logSteps("fail","WebDriverException : "+e.getMessage());
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			logSteps("pass", "switch In to the Frame "+ele);
		} catch (NoSuchFrameException e) {
			logSteps("fail","WebDriverException : "+e.getMessage());
		} catch (WebDriverException e) {
			logSteps("fail","WebDriverException : "+e.getMessage());
		} 
	}

	public void acceptAlert() {
		String text = "";		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.accept();
			logSteps("pass", "The alert "+text+" is accepted.");
		} catch (NoAlertPresentException e) {
			logSteps("fail", "There is no alert present.");
		} catch (WebDriverException e) {
			logSteps("fail", "WebDriverException : "+e.getMessage());
		}  
	}

	public void dismissAlert() {
		String text = "";		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.dismiss();
			logSteps("pass", "The alert "+text+" is dismissed.");
		} catch (NoAlertPresentException e) {
			logSteps("fail", "There is no alert present.");
		} catch (WebDriverException e) {
			logSteps("fail", "WebDriverException : "+e.getMessage());
		} 
	}

	public String getAlertText() {
		String text = "";		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
		} catch (NoAlertPresentException e) {
			logSteps("pass", "There is no alert present.");
		} catch (WebDriverException e) {
			logSteps("fail", "WebDriverException : "+e.getMessage());
		} 
		return text;
	}

	public void takeSnap(){
			try {
				FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./snaps/img"+i+".jpg"));
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public void closeBrowser() {
		try {
			driver.close();
			logSteps("pass", "The browser is closed");
		} catch (Exception e) {
			logSteps("fail","The browser could not be closed");
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			logSteps("pass", "The opened browsers are closed");
		} catch (Exception e) {
			logSteps("fail","Unexpected error occured in Browser");
		}
	}

}