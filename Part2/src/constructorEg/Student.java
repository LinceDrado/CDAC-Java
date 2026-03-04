/**
 * 
 */
package constructorEg;

import java.util.Scanner;

/**
 * @author dac
 *
 */
public class Student {
	
	int sid;
	String sname;
	int mark;
	
	Student(){
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter details: ");
//		sid = sc.nextInt();
//		sname = sc.next();
//		mark = sc.nextInt();
//		
//		sc.close();
		System.out.println("Id" + "\t" + "Name" + "\t" + "Mark");
	}
	
	Student(int sid, String sname, int mark){
		
		this.sid = sid;
		this.sname = sname;
		this.mark = mark;
		
	}
	
	public void displayStudent() {
		
		
		System.out.println(sid + "\t" + sname + "\t" + mark);
		
	}

}
