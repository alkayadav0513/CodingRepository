package hashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample4 {

	public static void main(String[] args) {
		// Create a HashMap
		HashMap<String, Integer> hashMap = new HashMap<>();

		// Add elements to the HashMap
		hashMap.put("John", 25);
		hashMap.put("Jane", 30);
		hashMap.put("Jim", 35);

		// Access elements in the HashMap - get(key)
		System.out.println(hashMap.get("John")); // Output: 25
		
		System.out.println(hashMap);

		// Remove an element from the HashMap
		hashMap.remove("Jim");
		
		System.out.println(hashMap);

		// Check if an element is present in the HashMap - containsKey(key)
		System.out.println(hashMap.containsKey("Jim"));//Output: false

		// Get the size of the HashMap
		System.out.println(hashMap.size()); //Output: 2
    
    System.out.println("****************************");
		Map<String, Integer> hashMap1 = new TreeMap<>();
		
		// Add elements to the HashMap
		hashMap1.put("John", 25);
		hashMap1.put("Jane", 30);
		hashMap1.put("Jim", 35);
		
		//Ascending order by the KEY
		System.out.println(hashMap1);
		
		System.out.println("****************************");
		Map<String, Integer> hashMap2 = new TreeMap<>(Comparator.reverseOrder());
		
		// Add elements to the HashMap
		hashMap2.put("John", 25);
		hashMap2.put("Jane", 30);
		hashMap2.put("Jim", 35);
		
		//Descending order by the KEY
		System.out.println(hashMap2);

	}

}
