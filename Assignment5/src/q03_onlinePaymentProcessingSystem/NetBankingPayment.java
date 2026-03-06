/**
 * 
 */
package q03_onlinePaymentProcessingSystem;

/**
 * @author dac
 *
 */
public class NetBankingPayment extends PaymentGateway {
	
	public void processPayment(int accountNumber, String accountHolderName, double amount){
		System.out.println("Transaction begins....");
		System.out.println("Mode is Net Banking Payment....");
		
		double debitedAmount = amount + (amount*(0.05));
		
		System.out.println(accountNumber +"\t"+ accountHolderName +"\t"+ amount +"\t" + debitedAmount);
	}
	
}
