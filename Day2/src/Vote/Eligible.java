package Vote;

import java.util.Scanner;

public class Eligible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ask for the persons age
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		
		//check if they are eligible
		if (age>18) {
			System.out.println("You are Eligible to Vote.");		
		}
		else {
			System.out.println("You are not eligible.");
		}
		sc.close();
	}

}
