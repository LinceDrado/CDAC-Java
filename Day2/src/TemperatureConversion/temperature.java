package TemperatureConversion;

public class temperature {
	public static void main (String[] args) {
		
		//declaring temperature in celsius
		double celsius = 30;
		
		//converting celsius to farhenite 
		double farehenite = ((celsius * 9/5) + 32);
		
		//printing values
		{
			System.out.println("Celsius = " + celsius + " degree");
			System.out.println("Farehenite = " + farehenite + " degree");
		}
		
	}
}
