package EvenOrOdd;

//import the Scanner Class
import java.util.Scanner;

public class check {
	public static void main(String[] args) {
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking a number input from user
		int num = sc.nextInt();
		
		//check if number is even or odd
		if (num%2 == 0) {
			System.out.println(num + " is an even number");
		}
		else {
			System.out.println(num + " is an odd number");
		}
		
		sc.close();
	}
}
