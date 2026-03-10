package q03;

/**
 * @author dac
 *
 */
public class Car implements Rental {

	int vehicleId;
	String vehicleName;
	int rentPerDay;
	
	/**
	 * @param vehicleId
	 * @param vehicleName
	 * @param rentPerDay
	 */
	public Car(int vehicleId, String vehicleName, int rentPerDay) {
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.rentPerDay = rentPerDay;
		
	}

	@Override
	public void rentVehicle(int days) {
		// TODO Auto-generated method stub
		System.out.println("Rented Vehicle is Car");
		System.out.println("The number of days to rent vehicle: " + days);
		
	}

	@Override
	public void calculateRent(int days) {
		// TODO Auto-generated method stub
		int totalRent = days*rentPerDay;
		System.out.println("Total rental cost for "+ days +" days = " + totalRent);
		if(days>5)
			System.out.println("Discounted Charges (10% Discount): " + (totalRent-(totalRent/10)));
		else
			System.out.print("No discount for less than 5 days...");
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Id: " + vehicleId);
		System.out.println("Vehicle Name: " + vehicleName);
		 
	}
	
	
	
}
