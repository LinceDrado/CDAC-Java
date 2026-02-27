/**
 * 
 */
package assignment1;

import java.util.Scanner;

/**
 * @author dac
 *salary and bonus
 */
public class PS11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter salary: ");
		int sal = sc.nextInt();
		
		salary(sal);
		
		sc.close();
	}
	
	public static void salary(int sal) {
		if(sal<10000) {
			sal = sal*12 + 500;
		}
		else if(sal>= 10000 && sal <20000) {
			sal = sal*12 + 1000;
		}
		
		System.out.println("Salary after bonus for 1 year... " + sal);
	}
	
}
