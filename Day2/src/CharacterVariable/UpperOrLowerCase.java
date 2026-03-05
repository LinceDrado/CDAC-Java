package CharacterVariable;

import java.util.Scanner;

public class UpperOrLowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ask for the character input from the user
		System.out.print("Give a character : ");
		char ch = sc.next().charAt(0);
		
		//check whether the character is upper or lower
		if (ch >='A' && ch<='Z') {
			System.out.println("Your character is in Upper-Case");
		}
		else if (ch >='a' && ch<='z') {
			System.out.println("Your character is in Lower-Case");
		}
		else
		{
			System.out.println("Not defined");
		}
		sc.close();
	}
}
