package week1.day1;

//classLevel accessmodifiers are two: public, default
public class Bicycle {

	//syntax to create variable
	//accessmodifier returnType/dataType nameOfVariable
	//accessmodifiers 4 types: public,protected,private,default
	public static String brand ="Herculus";
	public static  String color ="red";
	public static boolean isPuncture = true;
	public static int numberOfWheels = 2;
	public static void main(String[] args) {
		/*System.out.println(brand);
		System.out.println(color);
		System.out.println(isPuncture);
		System.out.println(numberOfWheels);*/
		String color2 = getColor("WIFE");
		System.out.println(color2);
		//putStand();
	}

	//syntax to create method
	//accessmodifier returnType methodName(argument variable){
	//logic
	//} 
	public static String getColor() {
		return "Black";
	}
	public static String getColor(String whose) {
		if (whose.equals("wife")) {
			return "Red";
		} else if(whose.equalsIgnoreCase("Daughter")) {
			return "Pink";
		}else{
			return "Blue";
		} 
	}
	public static void putStand() {
		System.out.println("stand on");
	}

}









