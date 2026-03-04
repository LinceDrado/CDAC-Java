/**
 * 
 */
package onlineshoppingcart;

import java.util.Scanner;

/**
 * @author dac
 *
 */
public class ProductMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product(10001, "Socks", 10, 50);
		p.totalBill();
		
		sc.close();
	}

}
