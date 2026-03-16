package fhWithObjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectsWrite {

	public static void main(String[] args) throws IOException {
		
		Employee e1 = new Employee(1001, "Ned", 1000);
		Employee e2 = new Employee(1002, "Jon", 2000);
		Employee e3 = new Employee(1003, "Robb", 3000);
		
		FileOutputStream fos = new FileOutputStream("ObjectFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		
		oos.close();
		fos.close();
		
		System.out.println("Writing Over...");
		
	}
	
}
