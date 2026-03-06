/**
 * 
 */
package q03_onlinePaymentProcessingSystem;

/**
 * @author dac
 *
 */
public class CreditCardPayment extends PaymentGateway {
	
	public void processPayment(int accountNumber, String accountHolderName, double amount){
		System.out.println("Transaction begins....");
		System.out.println("Mode is Credit Card Payment....");
		
		double debitedAmount = amount + (amount*(2.4/100));
		
		System.out.println(accountNumber +"\t"+ accountHolderName +"\t"+ amount +"\t" + debitedAmount);
	}
	
}
