package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class DDCW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement mul = driver.
				findElementByXPath("(//div[@class='example'])[6]/select");
		Select sel= new Select(mul);
		boolean multiple = sel.isMultiple();
		System.out.println(multiple);
		if(multiple == true) {
			System.out.println("I'm in if condition");
			sel.selectByIndex(1);
			sel.selectByVisibleText("UFT/QTP");
		}else {
			System.out.println("I'm in else condition");
			sel.selectByIndex(1);

		}
	}

}
