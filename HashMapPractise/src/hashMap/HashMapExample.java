package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Banglore");
		hm.put(2, "Hyderabad");
		hm.put(3, "Pune");
		hm.put(4, "Chennai");
		hm.put(5, "Mumbai");
		
		for(Integer i : hm.keySet()) {
			System.out.println(i);
		}
		for(String s : hm.values()) {
			System.out.println(s);
		}
		
		for(Map.Entry<Integer, String> show : hm.entrySet()) {
			System.out.println(show.getKey() + "\t" + show.getValue());
		}
		
	}
	
}
