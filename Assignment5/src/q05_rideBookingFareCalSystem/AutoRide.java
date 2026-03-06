package q05_rideBookingFareCalSystem;

public class AutoRide extends Ride{
	 double autoTax;

	/**
	 * @param rideId
	 * @param passengerName
	 */
	public AutoRide(int rideId, String passengerName, double autoTax) {
		super(rideId, passengerName);
		this.autoTax = autoTax;
		// TODO Auto-generated constructor stub
	}
	 
	public void calculateFare(double distance){
		this.riderDetails();
		System.out.println("Distance Traveled = " + distance );
		System.out.println(" Your Bike Ride Price = " + (distance*autoTax));
	}
	 
}
