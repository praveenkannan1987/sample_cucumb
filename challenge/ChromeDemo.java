package challenge;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDemo {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
		op.setHeadless(false);
		//op.addArguments("--disable-notifications");
		// To run in private  mode
		op.addArguments("--incognito");
		// To start browser in full screen
		op.addArguments("--start-fullscreen");
		// To disable the yellow info bar
		op.addArguments("--disable-infobars");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}

}
