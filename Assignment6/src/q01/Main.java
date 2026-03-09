package q01;
/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee e;
		e = new FullTimeEmployee(1001, "Babaji", 15000, 2000, 500);
		e.displayEmployee();
		e.calculateSalary();
		
		System.out.println("\n\n");

		e = new ContractEmployee(1002, "Babaji", 160, 100);
		e.displayEmployee();
		e.calculateSalary();

	}

}
