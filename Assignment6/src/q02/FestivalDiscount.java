package q02;
/**
 * 
 */
public class FestivalDiscount implements Discount {

	@Override
	public void calculateDiscount(double price) {
		
		double discountPrice = price - (price/5);
		System.out.println("Price: " + price);
		System.out.println("Festival Discount Price: " + discountPrice);
		
	}

}
