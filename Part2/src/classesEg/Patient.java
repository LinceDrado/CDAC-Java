/**
 * 
 */
package classesEg;

import java.util.Scanner;

/**
 * @author dac
 *
 */
public class Patient {
	
	String p_name;
	int p_id;
	int p_age;
	String p_dept;
	long p_contact;
	
	public void enterDetails() {
		
		Scanner sc = new Scanner(System.in);
		p_id = sc.nextInt();
		sc.nextLine();
		p_name = sc.nextLine();
		p_age = sc.nextInt();
		sc.nextLine();
		p_dept = sc.nextLine();
		p_contact = sc.nextLong();
		sc.close();
		
	}
	public void showDetails() {
		
		System.out.println(p_id);
		System.out.println(p_name);
		System.out.println(p_age);
		System.out.println(p_dept);
		System.out.println(p_contact);
		
	}
}
