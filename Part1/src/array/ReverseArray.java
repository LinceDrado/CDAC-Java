package array;

/**
 * Reverse Array
 */
public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] revArray = {1,2,3,4};
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
