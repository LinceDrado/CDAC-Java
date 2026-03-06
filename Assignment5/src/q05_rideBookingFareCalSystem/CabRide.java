package q05_rideBookingFareCalSystem;

public class CabRide extends Ride{
	double carTax;

	/**
	 * @param rideId
	 * @param passengerName
	 */
	public CabRide(int rideId, String passengerName, double carTax) {
		super(rideId, passengerName);
		this.carTax = carTax;
		// TODO Auto-generated constructor stub
	}
	
	public void calculateFare(double distance){
		this.riderDetails();
		System.out.println("Distance Traveled = " + distance );
		System.out.println(" Your Bike Ride Price = " + (distance*carTax));
	}
}
