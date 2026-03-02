package assignment2;

import java.util.Scanner;

/**
 * @author dac
 *
 */
public class Q02 {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter size of array: "); int n = sc.nextInt();
		int[] revArray = new int[n];
		
		System.out.println("Enter in Array: ");
		for(int i=0;i<revArray.length;i++) {
			revArray[i] = sc.nextInt();
		}
		
		for(int show : revArray) {
			System.out.print(show + " ");
		}
		System.out.println();
		
		reverseArray(revArray);

	}
	
	public static void reverseArray(int[] revArray) {
			
			int i=0, j=revArray.length-1;
			
			while(i < j) {
				int temp = revArray[i];
				revArray[i] = revArray[j];
				revArray[j] = temp;
				i++;
				j--;
			}
			
			for(int show : revArray) {
				System.out.print(show + " ");
			}
			
		}
	
}
