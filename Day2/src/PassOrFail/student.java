package PassOrFail;

public class student {
	public static void main(String[] args) {
		
		//declare student name
		String name = "Babaji";
		
		//declare marks of the student
		int marks = 80;
		
		System.out.println("Name of the student : " + name);
		System.out.println("Marks of the student : " + marks);
		
		//check if pass or fail
		if (marks >= 40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}
