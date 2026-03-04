/**
 * 
 */
package electricityBill;

/**
 * @author dac
 *
 */
public class BillCalculatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ElectricityConnection ec = new ElectricityConnection(101, "babaji", 1000);
		
		ec.totalBill();

	}

}
