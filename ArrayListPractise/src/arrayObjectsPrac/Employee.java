package arrayObjectsPrac;

public class Employee {
	int id;
	String name;
	int sal;
	
	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public void display() {
		System.out.println(id + "\t" + name + "\t" + sal);
	}
	
}
