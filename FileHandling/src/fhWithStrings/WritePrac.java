package fhWithStrings;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritePrac {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("Demo1.txt", true);
//		String str = sc.nextLine();
		int mob = sc.nextInt();
//		fw.write(str + "\n");
		fw.write(mob);
		
		fw.close();
		System.out.println("File Write Successfull..");
		
		sc.close();
	}

}
