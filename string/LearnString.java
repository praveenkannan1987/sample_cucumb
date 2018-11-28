package string;

public class LearnString {

	public static void main(String[] args) {
		/**
		 * String class to create and manipulate strings.
		 * 
		 * Methods
		 * 0) toCharArray() // convert string to character
		 * 1) length // find the number of characters
		 * 2) charAt(index) // The character at the index
		 * 3) trim // Removes the white space on begining and End
		 * 4) toLowerCase, toUpperCase // to convert case
		 */
		
		String text = "Test leaf";
		System.out.println(text.trim());  
		int n = (int)text.charAt(0);
		System.out.println(n);  
		//char[] ch = text.toCharArray();
		//System.out.println(text.length());
		/*for (int i = text.length()-1; i >= 0; i--) {
			 System.out.print(text.charAt(i));  
		}*/

	}

}
