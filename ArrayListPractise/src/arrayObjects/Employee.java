/**
 * 
 */
package arrayObjects;

/**
 * 
 */
public class Employee {

	int empId;
	String name;
	int salary;
	/**
	 * @param empId
	 * @param name
	 * @param salary
	 */
	public Employee(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(empId + "\t" + name + "\t" + salary);
	}
	
}
