package arrayObject;

/**
 * @author dac
 *
 */
public class Employee {

	int empno;
	String name;
	int sal;
	
	public Employee(int empno, String name, int sal) {
		
		this.empno = empno;
		this.name = name;
		this.sal = sal;
		
	}
	
	public void display() {
		
		System.out.println(empno + "\t" + name + "\t" + sal);
		
	}
	
}
