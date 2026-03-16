package arrayObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import hashMapPrac.Employee;

/**
 * 
 */
public class EmployeeManagement {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> al = new ArrayList<>();
	Employee e1 = new Employee(1001,"Nakul",20000);
	Employee e2 = new Employee(1002,"Jon",30000);
	Employee e3 = new Employee(1003,"Ned",40000);
	Employee e4 = new Employee(1004,"Bran",50000);
	
	public ArrayList<Employee > addEmployees() {
		
		System.out.println("----------Adding----------");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		return al;
		
	}
	
	public void displayEmployees(ArrayList<Employee> al) {
		
		for(Employee e : al) {
			e.display();
		}
		
	}
	
	public void updateEmployees(ArrayList<Employee> al) {
		
		System.out.println("----------Updation----------");
		System.out.print("Enter id to update: "); int id = sc.nextInt();
		for(Employee e : al) {
			if(e.empId == id) {
				e.salary = 100000;
			}
		}
		
	}
	
	public void removeEmployees(ArrayList<Employee> al) {
		
		System.out.println("----------Deletion----------");
		System.out.print("Enter id to delete: "); int id = sc.nextInt();
		int pos = 0;
		for(Employee e : al) {
			if(e.empId == id) {
				pos = al.indexOf(e);
			}
		}
		al.remove(pos);
		
	}
	
	public void sortEmployeesBySalary(ArrayList<Employee> al) {
		
		System.out.println("----------Sorting----------");
		SortBySalary sbs = new SortBySalary();
		Collections.sort(al, sbs);
		
	}
	
public void sortEmployeesByName(ArrayList<Employee> al) {
		
		System.out.println("----------Sorting----------");
		SortByName sbn = new SortByName();
		Collections.sort(al, sbn);
		
	}
	
}
