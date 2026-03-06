/**
 * 
 */
package q05_rideBookingFareCalSystem;

/**
 * @author  
 *
 */
public class BikeRide extends Ride{
	
	int bikeTax;

	/**
	 * @param rideId
	 * @param passengerName
	 */
	public BikeRide(int rideId, String passengerName, int bikeTax) {
		super(rideId, passengerName);
		this.bikeTax = bikeTax;
		// TODO Auto-generated constructor stub
	}

	public void calculateFare(double distance){
		this.riderDetails();
		System.out.println("Distance Traveled = " + distance );
		System.out.println(" Your Bike Ride Price = " + (distance*bikeTax));
	}
	
	
}
