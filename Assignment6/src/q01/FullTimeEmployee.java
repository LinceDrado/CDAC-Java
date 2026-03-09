package q01;
/**
 * 
 */
public class FullTimeEmployee extends Employee {
	int basicSal;
	int hra;
	int allowance;
	public FullTimeEmployee(int empId, String name, int basicSal, int hra, int allowance) {
		super(empId, name);
		this.basicSal = basicSal;
		this.hra = hra;
		this.allowance = allowance;
	}
	@Override
	public void calculateSalary(){
		int finalSal = basicSal + hra + allowance;
		System.out.println("Salary of Employee: " + finalSal);
	}
	@Override
	public void displayEmployee() {
		super.displayEmployee();
		System.out.println("Employee is Full Time....");
	}
}
