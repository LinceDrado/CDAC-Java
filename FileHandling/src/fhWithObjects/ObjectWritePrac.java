package fhWithObjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWritePrac {
	public static void main(String[] args) throws IOException {
		
		Employee e1 = new Employee(101, "Babaji", 10000);
		
		FileOutputStream fos = new FileOutputStream("Object1");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		
		oos.close();
		fos.close();
		
		System.out.println("Object Written Successfully..");
		
	}
}
