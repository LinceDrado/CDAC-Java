package hashMapObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapObject {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Employee obj;
		HashMap<Integer, Employee> hm = new HashMap<>();
		
		Employee e1 = new Employee(1001, "Ned", 100);
		Employee e2 = new Employee(1002, "Jon", 100);
		Employee e3 = new Employee(1003, "Robb", 100);
		Employee e4 = new Employee(1004, "Bran", 100);
		Employee e5 = new Employee(1005, "Rick", 100);
		
//		Add
		hm.put(e1.empId, e1);
		hm.put(e2.empId, e2);
		hm.put(e3.empId, e3);
		hm.put(e4.empId, e4);
		hm.put(e5.empId, e5);
		
//		Display
		for(Map.Entry<Integer, Employee> ie : hm.entrySet()) {
			System.out.print(ie.getKey() + ": ");
			obj = ie.getValue();
			obj.display();
		}
		
//		Search
		System.out.print("Enter key to search: "); int key1 = sc.nextInt();
		obj = hm.get(key1);
		obj.display();
		
//		update
		System.out.print("Enter key to update: "); int key2 = sc.nextInt();
		obj = hm.get(key2);
		obj.salary = 0;
		for(Map.Entry<Integer, Employee> ie : hm.entrySet()) {
			System.out.print(ie.getKey() + ": ");
			obj = ie.getValue();
			obj.display();
		}
		
//		remove
		System.out.print("Enter key to delete: "); int key3 = sc.nextInt();
		obj = hm.remove(key3);
		for(Map.Entry<Integer, Employee> ie : hm.entrySet()) {
			System.out.print(ie.getKey() + ": ");
			obj = ie.getValue();
			obj.display();
		}
		
		sc.close();
		
	}
	
}
