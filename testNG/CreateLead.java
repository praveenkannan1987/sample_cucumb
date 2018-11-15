package leaf.Lead;



import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	

	//@Test(invocationCount = 3,threadPoolSize=4)
	//@Test(invocationCount = 3,invocationTimeOut = 3000)
	//@Test(invocationCount = 3,timeOut = 5000)
	@Test(successPercentage = 40)
	public void createLead() {	
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "cName");
		type(locateElement("id", "createLeadForm_firstName"), "fName");
		type(locateElement("id", "createLeadForm_lastName"), "lName");
	

		click(locateElement("name", "submitButton"));		
	}
	
	
	
	
}












