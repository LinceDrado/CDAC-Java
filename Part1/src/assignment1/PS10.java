package assignment1;

import java.util.Scanner;

/**
 * @author dac
 * if-else-if ladder
 */
public class PS10 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		if(age < 0) {
			System.out.println("Age invalid");
		}
		else if(age >= 0 && age<=12) {
			System.out.println("Child");
		}
		else if(age>=13 && age<=18) {
			System.out.println("Teenager");
		}
		else {
			System.out.println("Adult");
		}
		
		
	}
}
