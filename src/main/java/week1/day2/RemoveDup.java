package week1.day2;

import java.util.Scanner;

public class RemoveDup {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		  int[] arr = new int[num];
		  int[] uniq = new int[num+4];*/
		int[] arr = {7,7,7, 8,8,8, 3, 4, 5, 6,6,6,6};
		  int j = 0;

		  // enter numbers into array
		  for (int i = 0; i < arr.length; i++) { 
		     int input = arr[i];
		     int[] uniq = new int[j];
		     if(uniq[input] != 1){
		         uniq[input] = 1;  
		         arr[j] = input;
		         j++;
		      }
		   } 

		   for (int i = 0; i < j; i++) {
		      System.out.println(arr[i]);
		   }
	}
}


