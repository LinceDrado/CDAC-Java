/**
 *Simple Inheritance – Employee Salary Calculation 
 */
package q01;

import java.util.Scanner;

/**
 * @author dac
 *
 */
public class EmployeeMain{
	public static void main(String[] args) {
		Manager m = new Manager();
//		m.empId = 101;
//		m.name = "Babaji";
//		m.basicSalary = 100;
		
		m.displayEmployeeDetails();
		m.calculateSalary();
		
	}
}



class Employee {
	
	int empId;
	String name;
	int basicSalary;
	
	Scanner sc = new Scanner (System.in);
	public void displayEmployeeDetails(){
		System.out.println("Prog starts!!!!!");
		empId = sc.nextInt();
		name = sc.next();
		basicSalary = sc.nextInt();

		System.out.println("ID: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + basicSalary);
	}
}

class Manager extends Employee{
	
	public void calculateSalary() {
		int bonus = 1000;
		int totalSalary = basicSalary + bonus;
		
		System.out.println("Bonus: "+ bonus);
	
		System.out.println("Total salary = " + totalSalary);
	}
	
	
}
