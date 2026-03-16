package fhWithObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArrayListObjectRead {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("ArrayListObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<Employee> al = (ArrayList<Employee>) ois.readObject();
		
		for(Employee e : al) {
			e.display();
		}
		
		ois.close();
		fis.close();

	}

}
