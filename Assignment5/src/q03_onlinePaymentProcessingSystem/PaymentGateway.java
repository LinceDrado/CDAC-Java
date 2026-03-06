/**
 * 
 */
package q03_onlinePaymentProcessingSystem;

/**
 * @author dac
 *
 */
public class PaymentGateway {
	
	int accountNumber;
	String accountHolderName;
	
	public void processPayment(int accountNumber, String accountHolderName, double amount){
		System.out.println("Transaction begins....");
		System.out.println(accountNumber +"\t"+ accountHolderName +"\t"+ amount);
	}
	
}
