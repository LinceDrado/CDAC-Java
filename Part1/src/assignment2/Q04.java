package assignment2;

import java.util.Scanner;

/**
 * @author dac
 * Call By Value YAy
 *
 */
public class Q04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter initial value: ");
		int num = sc.nextInt();
		
		System.out.println("Element before change: " + num);
		
		System.out.print("Enter updated value: ");
		int newNum = sc.nextInt();
		System.out.println("Element after change: " + valueChange(num, newNum));
		
		sc.close();
	}

	public static int valueChange(int num, int newNum) {
		
		num = newNum;
		return num;
		
	}

}
