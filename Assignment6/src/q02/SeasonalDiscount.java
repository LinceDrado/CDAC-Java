package q02;
/**
 * 
 */
public class SeasonalDiscount implements Discount {

	@Override
	public void calculateDiscount(double price) {
		
		double discountPrice = price - (price/10);
		System.out.println("Price: " + price);
		System.out.println("Seasonal Discount Price: " + discountPrice);
		
	}

}
