package fhWithObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadPrac {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("Object1");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e = (Employee) ois.readObject();
		e.display();
		
		ois.close();
		fis.close();
		
	}
}
