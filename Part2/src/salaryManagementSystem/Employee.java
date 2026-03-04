package salaryManagementSystem;

public class Employee {
	
	int empId;
	String empName;
	int basicSalary;
	
	Employee(){
		empId = 101;
		empName = "Babaji";
		basicSalary = 50000;
	}
	
	public void SalaryCalculator() {
		System.out.println("Total Salary: " + basicSalary);
		System.out.println("HRA: " + basicSalary * 0.2);
		System.out.println("Da: " + basicSalary * 0.1);
	}
}
