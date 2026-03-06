/**
 * 
 */
package q02_hotelRoomBooking;

/**
 * @author dac
 *
 */
public class HotelRoomMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		calculateCost(5, 1200, 1500);

	}
	
	public static void calculateCost(int noOfDays) {
		System.out.println("Number of Days: " + noOfDays);
	}
	
	public static void calculateCost(int noOfDays, int costPerDay) {
		System.out.println("Charges (noOfDays * costPerDay): " + (noOfDays*costPerDay));
	}
	
	public static void calculateCost(int noOfDays, int costPerDay, int foodCharges) {
		System.out.println("Charges (noOfDays * costPerDay + foodCharges): " + ((noOfDays*costPerDay)+foodCharges));
	}

}
