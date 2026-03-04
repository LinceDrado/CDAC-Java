package arrayObject;

import java.util.Scanner;

public class EmployeeManagement {
	
	Scanner sc = new Scanner(System.in);
	
	Employee[] e = new Employee[2];

	public void getDetails() {
		
		System.out.println("Input Sequence: \n1. Employee ID\n2. Employee Name\n3. Employee Salary");
		for(int i=0;i<e.length;i++) {
			System.out.println("Enter details of employee " + (i+1) + ": ");
			e[i] = new Employee(sc.nextInt(), sc.next(), sc.nextInt());
		}
		
	}

	public void showDetails() {
		
		System.out.println("ID" + "\t" + "Name" + "\t" + "Salary");
		for(int i=0;i<e.length;i++) {
			e[i].display();
		}
		
	}
	
	
	
}
