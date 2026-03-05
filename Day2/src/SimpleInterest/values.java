package SimpleInterest;

import java.util.Scanner;

public class values {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//taking values for principle, rate, time
		System.out.print("Principle : ");
		double prin = sc.nextDouble();
		
		System.out.print("Rate : ");
		double rate = sc.nextDouble();
		
		System.out.print("Time : ");
		double time = sc.nextDouble();
		
		//calculate simple interest
		double si = prin * rate * time / 100;
		
		//check if simple interest is high or low
		if (si> 100) {
			System.out.println("Simple interest of " + si + " is high.");
		}
		else {
			System.out.println("Simple interest of " + si + " is low.");
		}
		
		sc.close();
	}
}
