package string;

import org.openxmlformats.schemas.drawingml.x2006.main.STSystemColorVal;

public class LearnString {

	public static void main(String[] args) {
		/**
		 * String class to create and manipulate strings.
		 * 
		 * Methods
		 * 
		 * 7) trim // Removes the white space on begining and End
		 * 0) toCharArray() //
		 * 1) length // find the number of characters		  
		 * 2) charAt(index) // The character at the index		  		  
		 * 3) indexOf(chr) , lastIndexOf(chr) // the index of the first or last match
		 * 4) concat //Concatenate two strings only  2+"Std"
		 * 5) toString() // Convert an existing data type to String
		 * 6) subString(beginIndex, endIndex) //Extracts a particular portion of String
		 * 8) toLowerCase, toUpperCase // to convert case		  
		 * 9) split('char') -- split(regex, limit) //		 	  
		 * 10)startsWith(s), endsWith(s), contains(s) // match 
		 * 11)replace(oldChar, newChar), replaceAll(regex, replacement) // 
		 * 
		 * 12) String, StringBuffer(ThreadSafe), StringBuilder(Not ThreadSafe) 
		 */
		Integer i  = 10;
		String text2 = "testleaf(12345)";
		String text1 = "Welcome Test leaf";
		String[] split = text2.split("[(]");
		
		System.out.println(split.length);
		String value = split[1];
		
		System.out.println(value.replaceAll("[)]", ""));
		
		
		
		/*String[] split = text1.split(" ");
		for (String eachValue : split) {
			if (eachValue.startsWith("t")) {
				System.out.println(eachValue);
			}
		}*/
		
		
		/*System.out.println(split.length);
		System.out.println(split[1]);*/
		//System.out.println(text1.substring(5,9));
		
		//System.out.println(i.toString());
		//System.out.println(text2+12);
		//System.out.println(text.lastIndexOf('e'));
		/*System.out.println(text.trim());  
		int n = (int)text.charAt(0);
		System.out.println(n);  */
		//char[] ch = text.toCharArray();
		//System.out.println(text.length());
		/*for (int i = text.length()-1; i >= 0; i--) {
			 System.out.print(text.charAt(i));  
		}*/

	}

}
