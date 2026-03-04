/**
 * 
 */
package Q9_movieTicket;

/**
 * @author dac
 *
 */
public class Movie {
	
	String  mName;
	int tPrice;
	int noTicket;
	
	Movie (String mName, int tPrice, int noTicket){
		this.mName = mName;
		this.tPrice = tPrice;
		this.noTicket = noTicket;
	}

	public void booking() {
		
		int bill = noTicket*tPrice;
		if (noTicket>5) {
			
			bill = bill - 100;
			
			System.out.println("After Discount of 100 :-");
			System.out.println(bill);
		}
		else {
			System.out.println(bill);
		}
		
	}
	
	
	
}
