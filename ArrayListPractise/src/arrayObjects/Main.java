package arrayObjects;

import java.util.ArrayList;

import hashMapPrac.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		EmployeeManagement em = new EmployeeManagement();
		ArrayList<Employee> al = em.addEmployees();
		em.displayEmployees(al);
		
		em.updateEmployees(al);
		em.displayEmployees(al);
		
//		em.removeEmployees(al);
//		em.displayEmployees(al);
		
		em.sortEmployeesByName(al);
		em.displayEmployees(al);

	}
	
}
