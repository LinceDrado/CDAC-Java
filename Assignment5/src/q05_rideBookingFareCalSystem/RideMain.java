package q05_rideBookingFareCalSystem;

public class RideMain {
	public static void main(String[] args) {
	Ride r;
	
	r = new BikeRide(101,"Babaji",100);
	((BikeRide) r).calculateFare(100);
	
	r = new CabRide(101,"Babaji",500);
	((CabRide) r).calculateFare(100);
	
	r = new AutoRide(101,"Babaji",700);
	((AutoRide)r).calculateFare(100);
	}
	
}
