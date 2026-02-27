/**
 * 
 */
package assignment1;

import java.util.Scanner;

/**
 * @author dac
 * Odd or Even
 */
public class PS7 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.print("Enter nummber: ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.print("Even");
		}
		else{
			System.out.print("Odd");
		}
	}
}
