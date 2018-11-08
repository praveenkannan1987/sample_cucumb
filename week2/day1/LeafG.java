package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafG {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		WebElement table = driver.findElementByTagName("table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 1; i <rows.size(); i++) {
			List<WebElement> cols = rows.get(i).
					findElements(By.tagName("td"));
			if (cols.get(1).getText().equals("80%")) {
				cols.get(2).click();
				break;
			}
		}
	}


}
