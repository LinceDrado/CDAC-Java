package InterchangingValues;

public class values {
	public static void main (String[] args) {
		//declaring initial value
		int num1 = 10;
		int num2 = 20;
		
		//printing initial value
		{
			System.out.println("Initial Values :-");
			System.out.println("First Number = " + num1);
			System.out.println("Second Number = " + num2 + "\n"); //add "\n" for new line
		}
		
		//interchanging the values using only arithematic operators
		num1 = num1 + num2; //num1 will now be total of both
		num2 = num1 - num2; // num2 will be total - initial num 2
		num1 = num1 - num2; // num1 will be total - new num2
		
		//printing new values
		{
			System.out.println("New Values :-");
			System.out.println("First Number = " + num1);
			System.out.println("Second Number = " + num2);
		}
	}
}
