package overriding;

/**
 * @author dac
 *
 */
public class Car extends Vehicle{
	@Override
	public void start() {
//		super.start();
		System.out.println("Car Starts");
	}
}
