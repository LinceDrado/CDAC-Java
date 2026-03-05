package TotalAndAverageMarks;

public class marks {
	public static void main(String[] args) {
		//taking marks of each subject
		int sub1 = 40;
		int sub2 = 60;
		int sub3 = 100;
		
		//calculating total marks
		int total = sub1 + sub2 + sub3;
		
		//calculating average marks
		int average = total/3;
		
		//printing marks
		{
			System.out.println("Subject 1 Marks = " + sub1);
			System.out.println("Subject 2 Marks = " + sub2);
			System.out.println("Subject 3 Marks = " + sub3);
			System.out.println("Total Marks = " + total);
			System.out.println("Average Marks = " + average);
		}
	}
}
