/**
 * 
 */
package electricityBill;

/**
 * @author dac
 *
 */
public class ElectricityConnection {
	
	int id;
	String name;
	int units;
	
	ElectricityConnection(int id, String name, int units){
		this.id = id;
		this.name = name;
		this.units = units;
	}

	public void totalBill() {
		int bill;
		if (units <= 100) {
			bill = units * 5;
			System.out.println(bill);
		}
		else if (units > 100 && units <= 200) {
			bill = units * 7;
			System.out.println(bill);
		}
		else if (units > 200) {
			bill = units * 10;
			System.out.println(bill);
		}
	}
	
	
		
}
