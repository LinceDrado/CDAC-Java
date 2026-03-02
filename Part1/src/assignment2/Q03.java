/**
 * 
 */
package assignment2;

import java.util.Scanner;

/**
 * @author dac
 * updation in an array
 *
 */
public class Q03 {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array: "); int n = sc.nextInt(); 
		
		int[] num= new int[n];
		
		System.out.println("Enter Array Elements: "); 
		for (int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		for( int show: num) {
			System.out.print(show + " ");
		}
		
		
		System.out.print("\nWhich Index to change: "); int index = sc.nextInt();
		System.out.println("\nEnter the new value: "); int update = sc.nextInt();
		change(num, index, update);
		
		
	}
	public static void change(int[] num, int index, int update) {
		
		num[index] = update;
		for( int show: num) {
			System.out.print(show + " ");
		} 
		
	}
		
}
