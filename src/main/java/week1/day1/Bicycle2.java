package week1.day1;

//classLevel accessmodifiers are two: public, default
public class Bicycle2 {

	//syntax to create variable
	//accessmodifier returnType/dataType nameOfVariable
	//accessmodifiers 4 types: public,protected,private,default
	public  String brand ="Herculus";
	public   String color ="red";
	public  boolean isPuncture = true;
	public  int numberOfWheels = 2;
	
	//syntax to create method
	//accessmodifier returnType methodName(argument variable){
	//logic
	//} 
	public  String getColor() {
		return "Black";
	}
	public  String getColor(String whose) {
		if (whose.equals("wife")) {
			return "Red";
		} else if(whose.equalsIgnoreCase("Daughter")) {
			return "Pink";
		}else{
			return "Blue";
		} 
	}
	public  void putStand() {
		System.out.println("stand on");
	}

}









