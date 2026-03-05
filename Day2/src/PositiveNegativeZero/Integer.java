package PositiveNegativeZero;

import java.util.Scanner;

public class Integer {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//ask for a number
		System.out.print("Give a number : ");
		int num = sc.nextInt();
		
		//check if it is positive negative or 0
		if (num > 0 ) {
			System.out.println("You have entered Positve number");
		}
		else if (num < 0 ) {
			System.out.println("You have entered Negative number");
		}
		
		else {
			System.out.println("You have entered Zero");
		}
		sc.close();
	}

}
