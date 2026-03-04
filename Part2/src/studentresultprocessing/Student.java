package studentresultprocessing;

/**
 * @author dac
 *
 */
public class Student {
	
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		
	}

	public void result() {
		
		if(marks >= 80) {
			System.out.println("1st Division...");
		}
		else if(marks < 80 && marks >= 60) {
			System.out.println("2nd Division...");
		}
		else if(marks < 60 && marks >= 40) {
			System.out.println("3rd Division...");
		}
		else {
			System.out.println("Fail...");
		}
		
	}
	
	
	
}
