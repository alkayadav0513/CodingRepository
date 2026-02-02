package CollectionsJava;

//2) Would like to import a specific classes/interface of the java.util package 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class CollectionFramework2 {

	public static void main(String[] args) {


		/*1) java.util has collection framework and one of the interface in 
		collection framework is MAP.MAP interface is implemented by 
		HashMap, HashTable, Properties, TreeMap, etc.
		2) MAP interface supports object type and not primitive type
		and this rules comes from collection framework.
		3) MAP interface supports homogeneous and heterogeneous data and this rule
		come from collection framework.
		4) MAP has KEY -VALUE PAIR. Both KEY and VALUE are OBJECTS.
		5) The KEY should unique and can be of any Object Type.
		6) The VALUE can have duplicate value and can be of any type.
		7) HashMap, HashTable, Properties, TreeMap classes - will follow point 2,3,4,5,6 */
		
		Map<String, Object> m1 = new HashMap<String, Object>();
		
		//Add elements to the map - put()
		m1.put("k1", "Kaushik");
		//The KEY with the VALUE in line 28 is removed from memory.
		//The KEY with the VALUE in line 32 remains in memory.
		//Duplication of KEY does not show compilation error
		m1.put("k1", "Sam");
		//Duplication of VALUE is allowed
		m1.put("k2", "Sam");
		m1.put("k3", 50);
		m1.put("k4", 'M');
		
		//Size of the map
		int mapSize = m1.size();
		System.out.println("Size of the map is "+mapSize);
		
		//Get the VALUE by the key used as argument of get method - Sam
		Object o1 = m1.get("k1");
		System.out.println(o1);
		
		//Get the VALUE by the key used as argument of get method - M
		Object o2 = m1.get("k4");
		System.out.println(o2);
		
		System.out.println("********Want to get all keys*********");
		Set<String> s1 = m1.keySet();
		Iterator<String> iter1 = s1.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		System.out.println("********Want to get all value*********");
		Collection<Object> c1 = m1.values();
		Iterator<Object> iter2 = c1.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		System.out.println("********Want to get all keys with its value*********");
		Set<String> s2 = m1.keySet();
		Iterator<String> iter3 = s2.iterator();
		Collection<Object> c2 = m1.values();
		Iterator<Object> iter4 = c2.iterator();
		while(iter3.hasNext() && iter4.hasNext()) {
			System.out.println(iter3.next()+"--"+iter4.next());
		}
	}

}

