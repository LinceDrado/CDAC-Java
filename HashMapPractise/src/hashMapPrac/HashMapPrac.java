package hashMapPrac;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrac {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		System.out.println("Adding");
		hm.put(1, "Blr");
		hm.put(2, "Hyd");
		hm.put(3, "Pune");
		
		System.out.println("Display");
		for(Map.Entry<Integer, String> obj :hm.entrySet()) {
			System.out.println(obj.getKey() + ": " + obj.getValue());
		}
		
	}
}
