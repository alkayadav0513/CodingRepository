package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample3 {

	public static void main(String[] args) {
		// Initialization of a HashMap
		Map<Integer, String> hm = new HashMap<Integer, String>();

		// Add elements using put method
		hm.put(1, "Geeks");
		hm.put(2, "For");
		hm.put(3, "Geeks");
		hm.put(4, "For");

		// Initial HashMap
		System.out.println("Mappings of HashMap are : " + hm);

		// Remove element with a key - using remove() method
		//This will remove that key value pair.
		String str = hm.remove(4);
		System.out.println("Value of key 4 is "+str);

		// Final HashMap after removal of key 4
		System.out.println("Mappings after removal are : " + hm);

	}

}


