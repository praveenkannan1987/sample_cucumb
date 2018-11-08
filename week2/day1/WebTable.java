package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		WebElement from = driver.findElementById("txtStationFrom");
		from.clear();
		from.sendKeys("MAS", Keys.TAB);
		WebElement to = driver.findElementById("txtStationTo");
		to.clear();
		to.sendKeys("SBC", Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		// find the table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		// find the rows
		List<WebElement> allRows = 
				table.findElements(By.tagName("tr"));
		System.out.println("size: "+allRows.size());
		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allCols = 
					allRows.get(i).findElements(By.tagName("td"));
			// first col of each row
			String text = allCols.get(1).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
	}

}
