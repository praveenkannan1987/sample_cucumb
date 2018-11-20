package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	@BeforeClass(groups="LeaftapsGeneric")
	public void setData() {
		testcaseName ="CreateLead";
		testDesc = "Create a new lead in leaftaps";
		author = "koushik";
		category = "smoke";
		excelFileName = "Login";
	}
	@Test(dataProvider="fetchData", groups= "smoke")
	public void createLead(String cname, String fname)   {
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), "");
		click(locateElement("name", "submitButton"));
	}
	
	/*@DataProvider(name = "getData", indices = {0})
	public Object[][] fetchData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Gayatri";
		data[0][2] =  "K";
		
		data[1][0] = "TestLeaf";
		data[1][1] = "Koushik";
		data[1][2] =  "C";
		return data;
	}*/
	
	
	
	
	
	
	

}
