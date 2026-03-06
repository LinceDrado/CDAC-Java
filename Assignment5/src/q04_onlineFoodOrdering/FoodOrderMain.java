package q04_onlineFoodOrdering;

import java.util.Scanner;

public class FoodOrderMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu.........");
		System.out.println("1. Dine In Order");
		System.out.println("2. Take Away Order");
		System.out.println("3. Home Delivery Order");
		System.out.print("Enter choice: "); int choice = sc.nextInt();
		System.out.print("Enter Id: "); int id = sc.nextInt();
		System.out.print("Enter Name: "); String name = sc.next();
		System.out.print("Enter Bill: "); int bill = sc.nextInt();
		
		
		FoodOrder fo;
		switch(choice) {
	
		case 1: {
			System.out.print("Enter Service Charge: "); int extraCharge = sc.nextInt();
			fo = new DineInOrder(id, name, extraCharge);
			((DineInOrder) fo).calculateBill(bill);
		}break;
		
		case 2: {
			System.out.print("Enter Packing Charge: "); int extraCharge = sc.nextInt();
			fo = new TakeAwayOrder(id, name, extraCharge);
			((TakeAwayOrder) fo).calculateBill(bill);
		}break;
		
		case 3: {
			System.out.print("Enter Delivery Charge: "); int extraCharge = sc.nextInt();
			fo = new HomeDeliveryOrder(id, name, extraCharge);
			((HomeDeliveryOrder) fo).calculateBill(bill);
		}break;
		
		default: System.out.println("Invalid Choice... Try Again...");
		
		}
		
		sc.close();
	}
}
