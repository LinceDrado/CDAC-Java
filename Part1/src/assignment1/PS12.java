/**
 * 
 */
package assignment1;
import java.util.*;

/**
 * @author dac
 * check upper lower
 */
public class PS12 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		int charac = (int) ch;
		
//		System.out.println(charac);
		
		String print = upperLower(charac);
		System.out.print(print);
		
		sc.close();
	}
	
	public static String upperLower(int charac) {
		String res = "";
		
		if(charac >=65 && charac <= 90) {
			res = "Upper";
		}
		else if(charac >=97 && charac <= 122) {
			res = "Lower";
		}
		else {
			res = "Invalid Character";
		}
		
		return res;
	}
	
}
