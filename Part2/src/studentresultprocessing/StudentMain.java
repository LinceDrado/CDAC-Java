/**
 * 
 */
package studentresultprocessing;

import java.util.Scanner;

/**
 * @author dac
 *
 */
public class StudentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student(1001, "Babaji", 89);
		s.result();
		
		sc.close();
	}

}
