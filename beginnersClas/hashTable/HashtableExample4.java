package hashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample4 {

	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		
		
		System.out.println("Initial Map: " + map); //{103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
		
		
		// Inserts, as the specified pair is unique - putIfAbsent()
		//IF 104 present ? Not present, insert it in the map
		map.putIfAbsent(104, "Gaurav");
		
		System.out.println("Updated Map: " + map);//{104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
		
		// Returns the current value, as the specified key already exist
		map.putIfAbsent(103, "Gaurav");
		System.out.println("Updated Map: " + map);//{104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
		
		
		// Returns the current value, as the specified key value pair already exist
		map.putIfAbsent(101, "Vijay");
		System.out.println("Updated Map: " + map);//{104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
		

	}

}

