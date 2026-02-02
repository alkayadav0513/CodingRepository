package treeSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		
		//Upcasting
		SortedSet<String> ts = new TreeSet<String>();

		// Adding elements into the TreeSet
		// using add()
		ts.add("India");
		ts.add("Australia");
		ts.add("South Africa");
		
		System.out.println(ts); //[Australia, India, South Africa]

		// Adding the duplicate element
		ts.add("India");

		// Displaying the TreeSet
		System.out.println(ts);  //[Australia, India, South Africa]

		// Removing items from TreeSet using remove()
		ts.remove("Australia");
		System.out.println("Set after removing " + "Australia:" + ts); //[India, South Africa]

		// Iterating over Tree set items - Throws values in ascending order because of TreeSet class being used
		System.out.println("Iterating over set:");
		Iterator<String> i = ts.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

