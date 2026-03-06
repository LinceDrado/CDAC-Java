/**
 * 
 */
package q04_onlineFoodOrdering;

/**
 * @author dac
 *
 */
public class TakeAwayOrder extends FoodOrder{
	
	int packingPrice;

	public TakeAwayOrder(int orderId, String customerName, int packingPrice) {
		super(orderId, customerName);
		this.packingPrice = packingPrice;
	}
	
	public void calculateBill(double price) {
		super.DispDetails();
		System.out.println("Your Bill Price (+ packing price)= " + (price+packingPrice));
	}
}
