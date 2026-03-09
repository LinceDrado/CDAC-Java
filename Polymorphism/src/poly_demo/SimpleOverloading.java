package poly_demo;

/**
 * @author dac
 *
 */
public class SimpleOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleOverloading so = new SimpleOverloading();
		
		so.area(3,6);

	}
	
	public void area(int i) {
		int area = i*i;
		System.out.println("Area of square: " + area);
	}
	
	public void area(int l, int b) {
		int area = l*b;
		System.out.println("Area of rectangle: " + area);
	}

}
