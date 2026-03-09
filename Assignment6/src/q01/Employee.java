package q01;

/**
 * 
 */
public abstract class Employee {
	
	int empId;
	String name;
	/**
	 * @param empId
	 * @param name
	 */
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	public abstract void calculateSalary();
	
	public void displayEmployee() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + name);
	}
	
}
