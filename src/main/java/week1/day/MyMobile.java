package week1.day;

import week1.day4.Mobile;
import week1.day4.Redmi;
import week1.day4.Samsung;

public class MyMobile {

	//syntax to create constructor
	public MyMobile() {
		
	} 
	public static void main(String[] args) {
		Mobile mb = new Redmi();
		mb.dialCall(1234567891);
		mb.IMEINumber();
		
	}

}
