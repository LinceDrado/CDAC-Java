/**
 * 
 */
package q04_onlineFoodOrdering;

/**
 * @author dac
 *
 */
public class FoodOrder {
	int orderId;
	String customerName;
	
	

	public FoodOrder(int orderId, String customerName) {
		this.orderId = orderId;
		this.customerName = customerName;
	}

	public void DispDetails() {
		System.out.println("Order id: "+orderId);
		System.out.println("Customer Name : "+customerName);
	}

	public void calculateBill(double price) {
		System.out.println("Your Bill Price = " + price);
	}
}
