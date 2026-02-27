/**
 * 
 */
package assignment1;

import java.util.Scanner;

/**
 * @author dac
 *check positive, negative or zero
 */
public class PS13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		
		System.out.print(checkInteger(number));
		
		sc.close();
	}
	
	public static String checkInteger(int number) {
		String res = "";
		if(number<0) {
			res = "Negative";
		}
		else if(number>0) {
			res = "Positive";
		}
		else {
			res = "Zero";
		}
		return res;
	}
	
}
