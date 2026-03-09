package q01;
/**
 * 
 */
public class ContractEmployee extends Employee{
	
	int workHours; 
	int perHourPay;
	public ContractEmployee(int empId, String name, int workHours, int perHourPay) {
		super(empId, name);
		this.workHours = workHours;
		this.perHourPay = perHourPay;
	}
	@Override
	public void calculateSalary(){
		int finalSal = workHours*perHourPay;
		System.out.println("Salary of Employee: " + finalSal);
	}
	@Override
	public void displayEmployee() {
		super.displayEmployee();
		System.out.println("Employee is Contract Base....");
	}
	
}
