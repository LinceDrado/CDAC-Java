package fhWithObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectsRead {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("ObjectFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e1 = (Employee) ois.readObject();
		Employee e2 = (Employee) ois.readObject();
		Employee e3 = (Employee) ois.readObject();

		e1.display();
		e2.display();
		e3.display();
		
		ois.close();
		fis.close();
		
		System.out.println("Read Successful...");
		
	}

}
