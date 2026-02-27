/**
 * 
 */
package assignment1;

import java.util.Scanner;

/**
 * @author dac
 * electricity bill
 */
public class PS14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Bil no: "); int billNo = sc.nextInt();
		System.out.print("Enter no of Units: "); int units = sc.nextInt();
		System.out.print("Enter rate per unit: "); int rate = sc.nextInt();
		
		int totalBill = electricityBill(billNo, units, rate);
		System.out.println(totalBill);
		
		sc.close();
	}
	
	public static int electricityBill(int billNo, int units, int rate) {
		int res = units*rate;
		System.out.print("Bill No. " + billNo + "\nTotal Bill: ");
		return res;
	}
	
}
