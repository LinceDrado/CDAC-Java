package DiscountedPrice;

public class price {
	public static void main (String[] args) {
		//declaring the product price and discount percentage
		double initialPrice = 1000;
		double discount = 50;
		
		//calculating discounted price
		double discountedPrice = initialPrice * discount / 100;
		
		//calculating final price
		double finalPrice = initialPrice - discountedPrice;
		
		//printing values
		{
			System.out.println("Initial Product Price = " + initialPrice);
			System.out.println("Discount Percentage = " + discount + "%");
			System.out.println("Final Product Price = " + finalPrice);
		}
	}
}
