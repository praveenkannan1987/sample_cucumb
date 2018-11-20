package groups;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel;
import wdMethods.ProjectMethods;

public class LearnDp extends ProjectMethods{

	@Test(dataProvider ="fetchData")
	public void readData(String s1, String s2) {
		System.out.printf("%s %s", s1 , s2);
		/*System.out.println(s1);
		System.out.println(s2);*/
	}
	
}
/*data[0][0] = "Tl";
		data[0][1] = "ad";
		
		data[1][0] = "cd";
		data[1][1] = "ef";
		
		data[2][0] = "gh";
		data[2][1] = "ij";*/








