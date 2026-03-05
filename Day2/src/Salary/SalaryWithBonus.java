package Salary;

import java.util.Scanner;

public class SalaryWithBonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declare the base salary of an employee
		System.out.print("Base Salary : ");
		double basesal = sc.nextDouble();
		
		//condition for bonus
		System.out.print("Total work hours : ");
		double workhours = sc.nextDouble();
		
		//check and give the bonus
		if(workhours>=50) {
			
			//declare the bonus amount
			System.out.print("Bonus amount : ");
			double bonus = sc.nextDouble();
			
			double finalsal = basesal+bonus;
			System.out.println("You have recieved bonus. Total Salary = " + finalsal);
		}
		else if (40<workhours && workhours<50) {
			
			//declare the bonus amount
			System.out.print("Bonus amount : ");
			double bonus = sc.nextDouble();
			
			double finalsal = basesal+ bonus/2;
			System.out.println("You have recieved half bonus. Total Salary = " + finalsal);
		}
		else {
			System.out.println("You have got no bonus. Your salary = " + basesal);
		}
		sc.close();
	}
}
