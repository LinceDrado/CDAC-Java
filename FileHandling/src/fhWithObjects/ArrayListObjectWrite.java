package fhWithObjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListObjectWrite {
	public static void main(String[] args) throws IOException {
		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee(1001, "Ned", 1000));
		al.add(new Employee(1002, "Jon", 2000));
		al.add(new Employee(1003, "Robb", 3000));
		
		FileOutputStream fos = new FileOutputStream("ArrayListObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(al);
		
		oos.close();
		fos.close();
		
		System.out.println("Write Successful...");
		
	}
}
