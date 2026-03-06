/**
 * 
 */
package q01_libFineCalcSystem;

/**
 * @author dac
 *
 */
public class LibraryFine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		calculateFine(6, 200, 1000);

	}
	
	public static void calculateFine(int lateDays) {
		System.out.println("Late Days: " + lateDays);
	}
	
	public static void calculateFine(int lateDays, int finePerDay) {
		System.out.println("Fine (late days * fine per day): " + (lateDays*finePerDay));
	}
	
	public static void calculateFine(int lateDays, int finePerDay, int additionalPenalty) {
		System.out.println("Fine (late days * fine per day + additional penalty): " + ((lateDays*finePerDay)+additionalPenalty));
	}

}
