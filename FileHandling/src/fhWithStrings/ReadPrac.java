package fhWithStrings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPrac {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("Demo1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		fr.close();
		
	}
}
