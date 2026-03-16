package arrayObjectsPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListManager {
	
	ArrayList<Employee> al = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public ArrayList<Employee> add() {
		Employee e1 = new Employee(101, "Ned", 100);
		Employee e2 = new Employee(102, "Jon", 200);
		Employee e3 = new Employee(103, "Robb", 300);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		return al;
		
	}
	
	public void show() {
		for(Employee e : al) {
			e.display();
		}
	}
	
	public void update() {
		System.out.print("Enter id to update: "); int key = sc.nextInt();
		for(Employee e : al) {
			if(e.id == key) {
				e.sal = 500;
			}
		}
	}
	
	public void delete() {
		System.out.print("Enter id to delete: "); 
		int key = sc.nextInt();
		int pos = 0;
		for(Employee e : al) {
			if(e.id == key) {
				pos = al.indexOf(e);
			}
		}
		al.remove(pos);
	}
	
	public void sort() {
		SortBySal ss = new SortBySal();
		Collections.sort(al, ss);
	}

}
