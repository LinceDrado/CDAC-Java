/**
 * 
 */
package q03;

/**
 * @author dac
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rental r;
		
		r = new Bike(1001, "Babaji", 500);
		r.displayDetails();	
		r.rentVehicle(6);
		r.calculateRent(6);
		
		System.out.println();System.out.println();
		
		r = new Car(1002, "Babaji", 1000);
		r.displayDetails();	
		r.rentVehicle(6);
		r.calculateRent(6);

	}

}
