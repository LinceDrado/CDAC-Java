/** Simple Inheritance – Vehicle and Car
 * 
 */
package q02;

/**
 * @author dac
 *
 */
public class VehicleMain {

	public static void main(String[] args) {
		
		Car c = new Car("KA01AB1234", "Toyota", 1500000);
		
		c.showVehicleInfo();
		c.displayCarPrice();

	}

}

class Vehicle{
	String vehicleNumber;
	String brand;
	
	public Vehicle(String vehicleNumber, String brand){
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
	}
	
	public void showVehicleInfo() {
		System.out.println("Vehicle number: "+ vehicleNumber);
		System.out.println("Brand: "+ brand);
	}
}

class Car extends Vehicle {
	int price;
	
	public Car(String vehicleNumber, String brand, int price){
		super(vehicleNumber, brand);
		this.price = price;
	}
	
	public void displayCarPrice() {
		System.out.println("Vehicle Price: "+ price);
		
	}
}
