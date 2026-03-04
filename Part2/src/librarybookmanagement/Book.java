/**
 * 
 */
package librarybookmanagement;

/**
 * @author dac
 *
 */
public class Book {
	
	int id;
	String b_name; 
	String a_name; 
	int price;

	public Book(int id, String b_name, String a_name, int price) {

		this.id = id;
		this.b_name = b_name; 
		this.a_name = a_name;
		this.price = price;
		
	}

	public void bill() {
		
		double finalBill;
		if(price > 1000) {
			finalBill = price - (price*0.15);
			System.out.println("You got 15% discount !!!!!!");
		}
		else {
			finalBill = price;
			System.out.println("You got no discount !!!!!!");
		}
		
		System.out.println("Book Id: " + id);
		System.out.println("Book Name: " + b_name);
		System.out.println("Author Name: " + a_name);
		System.out.println("Price: " + price);
		System.out.println("Bill: " + finalBill);
		
	}

}
