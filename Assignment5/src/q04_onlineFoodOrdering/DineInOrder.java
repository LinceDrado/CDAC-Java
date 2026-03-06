/**
 * 
 */
package q04_onlineFoodOrdering;

/**
 * @author dac
 *
 */
public class DineInOrder extends FoodOrder {
	int serviceCharge;

	/**
	 * @param orderId
	 * @param customerName
	 */
	public DineInOrder(int orderId, String customerName, int serviceCharge) {
		super(orderId, customerName);
		this.serviceCharge = serviceCharge;
		// TODO Auto-generated constructor stub
	}
	
	public void calculateBill(double price) {
		super.DispDetails();
		System.out.println("Your Bill Price (+ service charge)= " + (price+serviceCharge));
	}
}
