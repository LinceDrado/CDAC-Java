/**
 * 
 */
package assignment1;

import java.util.Scanner;

/**
 * @author dac
 * age for vote
 */
public class PS15 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		System.out.println(ageForVote(age));
		
		sc.close();
	}
	
	public static String ageForVote(int age) {
		String res = "";
		if(age >= 18) {
			res = "You can vote";
		} else {
			res = "You can't vote";
		}
		return res;
	}
	
}
