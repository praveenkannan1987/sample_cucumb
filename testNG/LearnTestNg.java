package testcases;

import org.testng.annotations.Test;

public class LearnTestNg {

	
	//@Test(enabled = false)//(priority = 1)
	@Test(expectedExceptions = Exception.class)
	public void CreateLead() {
		System.out.println("CreateLead");
		throw new RuntimeException();
	}
	
	//@Test(priority = 2)
	@Test(dependsOnMethods =
		{"testcases.LearnTestNg.CreateLead"
		,"testcases.LearnTestNg.DeleteLead"},alwaysRun = true)
	public void EditLead() {
		System.out.println("EdtLead");
	}
	@Test//(dependsOnMethods = "testcases.LearnTestNg.CreateLead")
	public void DeleteLead() {
		System.out.println("DeleteLead");
	}
	
}




