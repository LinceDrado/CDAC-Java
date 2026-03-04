/**
 * 
 */
package librarybookmanagement;

import java.util.Scanner;

/**
 * @author dac
 *
 */
public class BookMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book b = new Book(1001, "A Song of Ice and Fire", "Dane", 2000);
		b.bill();
		
		sc.close();
	}

}
