package q02;
/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Discount d;
		d = new FestivalDiscount();
		d.calculateDiscount(6000);
		
		d = new SeasonalDiscount();
		d.calculateDiscount(6000);

	}

}
