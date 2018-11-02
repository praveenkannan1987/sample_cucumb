package week1.day2;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "capitialize first letter in a given sentence";
		for (String str : s.split(" ")) {
			char charAt = str.toUpperCase().charAt(0);
			String replace = str.replace(str.charAt(0), charAt);
			System.out.print(replace + " ");
		} 

	}

}
