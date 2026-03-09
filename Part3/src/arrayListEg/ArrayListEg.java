/**
 * 
 */
package arrayListEg;

/**
 * @author dac
 *
 */
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		intArrayList();
		stringArrayList();
		
	}
	
	public static void intArrayList() {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(60);
		al.add(50);
		al.add(30);
		al.add(90);
		System.out.println("Initial Array: " + al.toString());
		
		
		al.add(3, 500);
		System.out.println("Adding element in 3rd index: " + al.toString());
		
		al.set(2, 10000);
		System.out.println("Updating 2nd index: " + al.toString());
	
		al.remove(1);
		System.out.println("Removing 1st index: " + al.toString());
	
		Collections.sort(al);
		System.out.println("Sorted Array: " + al.toString());
		
		if(al.contains(90)) {
			System.out.println("Array contains.....");
		}
		else {
			System.out.println("Array doesn't contains.....");
		}
	}
	
	public static void stringArrayList() {
		ArrayList <String> s = new ArrayList<String>();
		
		s.add("Alpha");
		s.add("Bravo");
		s.add("Charlie");
		s.add("Delta");
		System.out.println("Array: " + s.toString());
		
		s.add(4,"Echo");
		System.out.println("Added element: " + s.toString());
		
		s.set(4,"Fox");
		System.out.println("Updated element: " + s.toString());
		
		s.remove(4);
		System.out.println("Updated element removed: " + s.toString());
		
		Collections.sort(s);
		System.out.println("Sorted array: " + s.toString());
		
		if(s.contains("Echo")) {
			System.out.println("Array contains.....");
		}
		else {
			System.out.println("Array doesn't contains.....");
		}
		
	}

}
