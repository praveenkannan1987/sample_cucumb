package learnDataProvider;

import org.testng.annotations.DataProvider;

public class Datas {

	@DataProvider(name = "getData")
	public Object[][] fetchData() {
		Object[][] data = new Object[3][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Gayatri";
		data[0][2] =  1234;
		
		data[1][0] = "TestLeaf";
		data[1][1] = "Koushik";
		data[1][2] =  567;
		
		data[2][0] = "TestLeaf";
		data[2][1] = "Sarath";
		data[2][2] =  890;
		return data;
	}
	@DataProvider(name = "getData1")
	public Object[][] fetchData1() {
		Object[][] data = new Object[1][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Gayatri";
		data[0][2] =  1234;
		
		return data;
	}
}
