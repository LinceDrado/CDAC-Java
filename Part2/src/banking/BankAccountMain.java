package banking;

import java.util.Scanner;

public class BankAccountMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		BankAccount ba1 = new BankAccount(101, "Babaji", 10000);
		
		System.out.println("Choices: \n1. Deposit \n2. Withdraw \n3. Show Balance");
		System.out.print("Enter your choice of transaction: : "); int choice = sc.nextInt();
		
		switch(choice) {
		
			case 1: {
				System.out.print("Enter the Amount to Deposit: "); int dep = sc.nextInt();
				ba1.deposit(dep);
			}break;
			
			case 2 : {
				System.out.print("Enter the Amount to withdraw: "); int wtd = sc.nextInt();
				ba1.withdraw(wtd);
			}break;
			
			case 3: {
				ba1.showBalance();
			}break;
			
			default : System.out.println("Invalid Choice !!!!");
		
		}
		
		
		sc.close();
	}
}
