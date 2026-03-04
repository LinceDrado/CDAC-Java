package constructorEg;

public class ParameterizedConstructor {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		Student s1 = new Student(1001, "Nakul", 56);
		s1.displayStudent();
		Student s2 = new Student(1002, "Jon", 53);
		s2.displayStudent();
		Student s3 = new Student(1003, "Ned", 75);
		s3.displayStudent();
		Student s4 = new Student(1004, "Bran", 78);
		s4.displayStudent();
		Student s5 = new Student(1005, "Robb", 96);
		s5.displayStudent();
		
	}

}
