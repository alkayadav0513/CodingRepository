package sortedSetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

//Removing the Values: The values can be removed from the SortedSet using the remove() method.

public class SortedSetExample3 {

	public static void main(String[] args) {
		
		//Upcasting
		SortedSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("A");
		ts.add("B");
		ts.add("C");
		//Duplicate Data
		ts.add("B");
		ts.add("D");
		ts.add("E");
		
		//Size of the Set
		System.out.println("Size of the set is "+ts.size());//5

		//Sorted in ascending/natural order due to TreeSet Class
		System.out.println("Initial TreeSet " + ts); //[A,B,C,D,E]

		// Removing the element b
		ts.remove("B");

		System.out.println("After removing element " + ts); //[A,C,D,E]

	}

}
