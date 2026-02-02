package hashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		System.out.println("Before remove: " + map);
		
		// Remove value for key 102 - remove(key)
		String str = map.remove(102);
		System.out.println("Value of the key 102 removed is "+str);
		
		System.out.println("After remove: " + map);

	}

}
