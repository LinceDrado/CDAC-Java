package Q8_insuarancePremiumCalculator;

public class InsuaranceApp {
	public static void main(String[] args) {
		
		PolicyHolder p = new PolicyHolder(101, "Babaji", 80, 10000);
		
		p.premiumCalculator();
		
	}
}
