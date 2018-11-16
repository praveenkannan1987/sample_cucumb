package learnDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	@Test(dataProvider="getData", dataProviderClass=Datas.class)
	public void createLead(String cname, String fname, int num)   {
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), ""+num);
		click(locateElement("name", "submitButton"));
	}
	
	@DataProvider(name = "getData")
	public Object[][] fetchData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Gayatri";
		data[0][2] =  1234;
		
		data[1][0] = "TestLeaf";
		data[1][1] = "Koushik";
		data[1][2] =  567;
		return data;
	}
	
	
	
	
	
	
	

}
