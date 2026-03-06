/**
 * 
 */
package q03_onlinePaymentProcessingSystem;

/**
 * @author dac
 *
 */
public class PaymentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		PaymentGateway p = new PaymentGateway();
//		p.processPayment(1001,"Babaji",2000);
		
//		CreditCardPayment c = new CreditCardPayment();
//		c.processPayment(1001, "Babaji", 2000);
		
//		UPIPayment upi = new UPIPayment();
//		upi.processPayment(1001, "Babaji", 2000);
		
		NetBankingPayment nb = new NetBankingPayment();
		nb.processPayment(1001, "Babaji", 2000);

	}

}
