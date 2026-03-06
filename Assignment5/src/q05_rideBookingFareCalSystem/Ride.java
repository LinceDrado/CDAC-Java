/**
 * 
 */
package q05_rideBookingFareCalSystem;

/**
 * @author dac
 *
 */
public class Ride {
	int rideId;
	String passengerName;
	
	/**
	 * @param rideId
	 * @param passengerName
	 */
	public Ride(int rideId, String passengerName) {
		this.rideId = rideId;
		this.passengerName = passengerName;
	}

	public void riderDetails() {
		System.out.println("Id = " + rideId);
		System.out.println("Passenger Name = " + passengerName);
	}


	public void calculateFare(double distance){
		System.out.println("Distance Traveled = " + distance );
	}
}
