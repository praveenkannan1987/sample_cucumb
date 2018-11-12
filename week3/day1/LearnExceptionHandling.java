package week3.day1;

import java.util.Scanner;

public class LearnExceptionHandling {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num;
		try {
			num = sc.nextInt();
			int num2 = sc.nextInt();
			int a = num/num2;
			System.out.println(a);
		} finally {
			
		}
		sc.close();
	}

}







