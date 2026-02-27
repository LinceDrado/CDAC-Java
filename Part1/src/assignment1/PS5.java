/**
 * 
 */
package assignment1;

/**
 * @author dac
 * price and discount
 *
 */
public class PS5 {
	public static void main(String args[]) {
		double price = 5000;
		double discount = 5;
		
		double finalPrice = (price-(price*(discount/100)));
		System.out.println("Price: "+price + "\tDiscount %: "+discount +"\tFinal Price: "+finalPrice);
	}
}
