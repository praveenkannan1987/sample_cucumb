package webTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTable {
	public static void main(String[] args) {
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

		WebElement table = 
				driver.findElementByXPath("//table[@class='DataTable TrainList']");

		List<WebElement> trs = table.
				findElements(By.tagName("tr"));
		System.out.println(trs.size());
		List<String> list = new ArrayList<>();
		for (WebElement rows : trs) {
			List<WebElement> cols = rows.
					findElements(By.tagName("td"));
			list.add(cols.get(1).getText());
		}
		Collections.sort(list);
		// user defined List
		List<String> sortedList = new ArrayList<>();
		driver.findElementByLinkText("Train Name").click();
		WebElement sortedTable = 
				driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> sortedRows = sortedTable.findElements(By.tagName("tr"));
		for (WebElement sortedDatas : sortedRows) {
			List<WebElement> tds = sortedDatas.findElements(By.tagName("td"));
			// add text to List
			sortedList.add(tds.get(1).getText());
		}
		// Comparsion
		for (String sortedValues : sortedList) {
			if(sortedList.equals(list)) {
				System.out.println("Matched " + sortedValues);
			}else {
				System.out.println("Not matched " + sortedValues);
			}
		}
		
		
	}

}







