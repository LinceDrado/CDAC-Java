package hotelBooking;

/**
 * @author dac
 *
 */
public class Room {
	
	int roomNo;
	int roomType;
	int pricePerNight;
	int noOfDays;
	
	Room (int roomNo, int roomType, int pricePerNight, int noOfDays){
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		this.noOfDays = noOfDays;
	}

	public void booking() {
		
		double dc;
		double bill = noOfDays*pricePerNight;
		if (noOfDays>5) {
			dc = bill * 20/100;
			
			double totalBill = bill - dc;
			
			System.out.println(totalBill);
		}
		else {
			System.out.println(bill);
		}
		
	}
	
	
	
}
