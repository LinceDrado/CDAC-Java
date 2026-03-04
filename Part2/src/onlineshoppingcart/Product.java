/**
 * 
 */
package onlineshoppingcart;

/**
 * @author dac
 *
 */
public class Product {
	
	int id;
	String name;
	int quantity;
	int price;

	public Product(int id, String name, int quantity, int price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public void totalBill() {
		
		double bill = quantity*price;
		double finalBill;
		if(bill > 5000) {
			finalBill = bill - (bill*0.1);
			System.out.println("You got 10% discount !!!!!!");
		}
		else {
			finalBill = bill;
			System.out.println("You got no discount !!!!!!");
		}
		
		System.out.println("Product Id: " + id);
		System.out.println("Product Name: " + name);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		System.out.println("Bill: " + bill);
		System.out.println("Final Bill: " + finalBill);
		
	}
	
	

}
