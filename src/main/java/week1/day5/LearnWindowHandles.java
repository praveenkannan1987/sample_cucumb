package week1.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		//set path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser 
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//load url
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://legacy.crystalcruises.com/");
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		// Returns the parent session ID
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		// Returns all the available windows
		Set<String> allWindows = driver.getWindowHandles();
		// create a list
		List<String> list = new ArrayList<>();
		// add all the windows to the list so that we can use get()
		list.addAll(allWindows); 
		driver.switchTo().window(list.get(1));
        System.out.println(driver.getTitle());
        driver.switchTo().window(list.get(0));
        System.out.println(driver.getTitle());
		
		
		
		
		

	}

}






