package learnDataProvider;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class LearnDP{

	@BeforeMethod
	public void before() {
		System.out.println("i am before method");
	}
	@AfterMethod
	public void after() {
		System.out.println("i am after method");
	}
	@Test(dataProviderClass=Datas.class, dataProvider = "getData1") 
	public void run(String cname, String fname, int num) {
		
		System.out.printf("%s %s %d", cname, fname, num);
	}
	
}








