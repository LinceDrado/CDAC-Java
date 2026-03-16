package fhWithStrings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("demo.txt");
		BufferedReader br  = new BufferedReader(fr);
		
//		String s1 = br.readLine();
//		String s2 = br.readLine();
//		System.out.println(s1 + "\n" + s2);
		
		String str;
		while((str=br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		fr.close();
		
	}
}
