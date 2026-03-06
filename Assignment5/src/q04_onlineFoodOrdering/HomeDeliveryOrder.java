package q04_onlineFoodOrdering;

/**
 * @author dac
 *
 */
public class HomeDeliveryOrder extends FoodOrder{
	int deliveryPrice;
	
	public HomeDeliveryOrder(int orderId, String customerName, int deliveryPrice) {
		super(orderId, customerName);
		this.deliveryPrice = deliveryPrice;
	}
	
	public void calculateBill(double price) {
		super.DispDetails();
		System.out.println("Your Bill Price (+ delivery price)= " + (price+deliveryPrice));
	}
}
