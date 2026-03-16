package fhWithStrings;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Wirte {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		FileWriter fr = new FileWriter("demo.txt", true);
		System.out.println("Enter String to input: ");
		String str = sc.nextLine();
		
		fr.write(str + "\n");
		
		fr.close();
		sc.close();
		System.out.println("File Write over");
		
	}
}
