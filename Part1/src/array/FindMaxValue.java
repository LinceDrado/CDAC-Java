package array;

/**
 *  Max value in Array
 */
public class FindMaxValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,3};
		
		int largest = maxInArray(arr);
		System.out.println("Largest element in array: " + largest);

	}

	public static int maxInArray(int[] arr) {
		
		int max = arr[0]; //Assume 0th is largest
		
		for(int i=0; i< arr.length;i++) {                 //run loop in an array
			if(arr[i] > max) {                            //check element if its larger than max
				max = arr[i];
			}
		}
		return max;
		
	}

}
