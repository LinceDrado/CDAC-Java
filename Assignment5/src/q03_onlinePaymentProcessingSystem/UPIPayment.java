/**
 * 
 */
package q03_onlinePaymentProcessingSystem;

/**
 * @author dac
 *
 */
public class UPIPayment extends PaymentGateway {

	public void processPayment(int accountNumber, String accountHolderName, double amount){
		System.out.println("Transaction begins....");
		System.out.println("Mode is UPI Payment....");
		
		double debitedAmount = amount + (amount*(1.5/100));
		
		System.out.println(accountNumber +"\t"+ accountHolderName +"\t"+ amount +"\t" + debitedAmount);
	}
	
}
