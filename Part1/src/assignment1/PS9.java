/**
 * 
 */
package assignment1;

import java.util.Scanner;

/**
 * @author dac
 * Simple interest
 *
 */
public class PS9 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		
		System.out.print("Enter principal: ");double principal = sc.nextDouble();
		System.out.print("Enter rate: ");double rate = sc.nextDouble();
		System.out.print("Enter time (in years): ");int time = sc.nextInt();
		
		double SI = principal*(rate/100)*time;
		System.out.println(SI);
		
	}
}
