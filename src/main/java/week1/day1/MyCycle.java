package week1.day1;

public class MyCycle {

	public static void main(String[] args) {
		//syntax to call another class
		//ClassName referenceName = new ClassName();
		//syntax to call a method/variable
		//referenceName.methodName();
		Bicycle2 cycle = new Bicycle2();
        String color = cycle.getColor("Daughter");
        System.out.println(color);
        boolean isPuncture = cycle.isPuncture;
        System.out.println(isPuncture);
	}

}
