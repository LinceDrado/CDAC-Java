package array;

/**
 * Sum of all values in int[] array
 */
public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4};
		
		System.out.print("Sum of all the elements in array: " + sumOfArray(array1));

	}

	public static int sumOfArray (int[] array1) {
		
		int sum = 0;
		for(int i=0;i<4;i++) {
			sum = array1[i] + sum;
		}
		return sum;
		
	}

}
