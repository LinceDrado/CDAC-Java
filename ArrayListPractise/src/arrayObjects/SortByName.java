package arrayObjects;

import java.util.Comparator;

import hashMapPrac.Employee;

public class SortByName implements Comparator<Employee> {
	
//	String comparision
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.name.equals(o2.name)) {            
			return 1;
		}
		else {
			return -1;
		}
	}

}
