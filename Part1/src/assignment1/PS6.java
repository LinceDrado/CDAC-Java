package assignment1;
import java.util.*;
/**
 * @author dac
 * Student pass or fail
 *
 */
public class PS6 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.print("Enter name: ");String name = sc.nextLine();
		System.out.print("Enter marks: ");int marks = sc.nextInt();
		
		if(marks<=40) {
			System.out.println("Name: "+name + "\nMarks: "+marks + "\nFail!!!");
		}
		else {
			System.out.println("Name: "+name + "\nMarks: "+marks + "\nPass!!!");
		}
		
	}
}
