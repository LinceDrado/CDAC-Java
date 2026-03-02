package assignment2;

import java.util.Scanner;

/**
 * @author dac
 * Switch case menu driven calculator
 *
 */
public class Q01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1: Addition");
			System.out.println("2: Subtraction");
			System.out.println("3: Multiplication");
			System.out.println("4: Division");
			System.out.println("5: Exit");
			System.out.print("Select option: "); int option = sc.nextInt();
			System.out.print("Enter num1: "); int num1 = sc.nextInt();
			System.out.print("Enter num2: "); int num2 = sc.nextInt();
			
			
			
			switch(option) {
				
				case 1: addition(num1, num2);
				break;
				case 2: subtraction(num1, num2);
				break;
				case 3: multiplication(num1, num2);
				break;
				case 4: division(num1, num2);
				break;
				case 5: System.exit(0);
				break;
				default: System.out.println("Invalid Input !!!");
				
			}
			sc.close();
		}
		
		
	}

	public static void division(int num1, int num2) {
		
		System.out.println("Division: " + (num1/num2));
		
	}

	public static void multiplication(int num1, int num2) {
		
		System.out.println("Multiplication: " + (num1*num2));
		
	}

	public static void subtraction(int num1, int num2) {
		
		System.out.println("Subtraction: " + (num1-num2));
		
	}

	public static void addition(int num1, int num2) {
		
		System.out.println("Addition: " + (num1+num2));
		
	}

}
