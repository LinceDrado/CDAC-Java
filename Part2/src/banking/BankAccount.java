package banking;


public class BankAccount {
	
	int accountNumber;
	String accountHolderName;
	int balance;
	
	
	
	BankAccount(int accountNumber, String accountHolderName, int balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	
	public void deposit(int dep) {
		
		if (dep > 0) {
			System.out.println("Deposited Amount: " + dep);  
			int newBal = dep + balance;
			
			System.out.print("Your New Balance: " + newBal);
		}
		else {
			System.out.println("Invalid Amount.");
		}
		
	}

	public void withdraw(int wtd) {
		if (wtd > 0) {
			System.out.println("Withdraw Amount: " + wtd);  
			int newBal =balance - wtd;
			
			System.out.print("Your New Balance: " + newBal);
		}
		else {
			System.out.println("Invalid Amount.");
		}
		
	}

	public void showBalance() {
		
		System.out.println("Your Balance: " + balance);
	}
	
}
