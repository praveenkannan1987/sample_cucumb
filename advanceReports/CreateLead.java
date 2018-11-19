package advanceReports;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	@BeforeClass
	public void setData() {
		testcaseName ="CreateLead";
		testDesc = "Create a new lead in leaftaps";
		author = "koushik";
		category = "smoke";
	}
	@Test(dataProvider="getData")
	public void createLead(String cname, String fname, String lname)   {
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		click(locateElement("name", "submitButton"));
	}
	
	@DataProvider(name = "getData", indices = {0})
	public Object[][] fetchData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Gayatri";
		data[0][2] =  "K";
		
		data[1][0] = "TestLeaf";
		data[1][1] = "Koushik";
		data[1][2] =  "C";
		return data;
	}
	
	
	
	
	
	
	

}
