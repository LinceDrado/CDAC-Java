package LargestNumber;

import java.util.Scanner;

public class numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//take the inputs from the user for both the number
		System.out.print("First Number : "); //writing only "print" instead of "println" so that the cursor stays at the same line
		int num1 = sc.nextInt();
		
		System.out.print("Second Number : "); //writing only "print" instead of "println" so that the cursor stays at the same line
		int num2 = sc.nextInt();
		
		//check and return the larger number
		if (num1>num2) {
			System.out.println(num1 + " is larger than " + num2);
		}
		else {
			System.out.println(num2 + " is larger than " + num1);

		}
		
		sc.close();
	}
}
