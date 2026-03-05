package PersonAge;

import java.util.Scanner;

public class years {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// define the age of the person
		System.out.print("Persons Age : ");
		int age = sc.nextInt();
		
		//checking if he is child, teen or adult
		if (age>18) {
			System.out.println("Person is Adult");
		}
		else if (age<=12) {
			System.out.println("Person is Child");
		}
		else {
			System.out.println("Person is Teenager");
		}
		sc.close();
	}
}
