package hashMapObjPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapObjPrac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee obj;
		
		HashMap<Integer, Employee> hm = new HashMap<>();
		
		Employee e1 = new Employee(101, "Ned", 100);
		Employee e2 = new Employee(102, "Jon", 200);
		Employee e3 = new Employee(103, "Robb", 300);
		
		System.out.println("Adding");
		hm.put(e1.empId, e1);
		hm.put(e2.empId, e2);
		hm.put(e3.empId, e3);
		
		System.out.println("Display");
		for(Map.Entry<Integer, Employee> eobj : hm.entrySet()) {
			Employee e = eobj.getValue();
			System.out.print(eobj.getKey() + ": ");
			e.display();
		}
		
		System.out.println("Search");
		System.out.print("Enter key to search: ");
		int key1 = sc.nextInt();
		obj = hm.get(key1);
		obj.display();
		
		System.out.println("Update");
		System.out.print("Enter key to update: ");
		int key2 = sc.nextInt();
		obj = hm.get(key2);
		obj.salary = 400;
		for(Map.Entry<Integer, Employee> eobj : hm.entrySet()) {
			Employee e = eobj.getValue();
			System.out.print(eobj.getKey() + ": ");
			e.display();
		}
		
		System.out.println("Delete");
		System.out.print("Enter key to delete: ");
		int key3 = sc.nextInt();
		obj = hm.remove(key3);
		
		for(Map.Entry<Integer, Employee> eobj : hm.entrySet()) {
			Employee e = eobj.getValue();
			System.out.print(eobj.getKey() + ": ");
			e.display();
		}
		
		sc.close();
	}
}
