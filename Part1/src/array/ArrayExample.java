package array;

import java.util.Scanner;

/**
 * Array Example, insertion and display using loops;
 */
public class ArrayExample {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] arr = new int[4];
		int[] arr1 = {0,1,2,3};
		
//		arrayWithoutLoop(arr1);
		
		arrayWithLoop(arr);
		
	}

	public static void arrayWithLoop(int[] arr) {
		
		for(int i=0;i<4;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int array : arr) {
			System.out.println(array);
		}
		
	}

	public static void arrayWithoutLoop(int[] arr1) {
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
	}

}
