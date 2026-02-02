package sortedSetInterface;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample1 {

	public static void main(String[] args) {
		
		//Upcasting
		//TreeSet class throws out data in ascending by default
		//The moment , we use the TreeSet class , it sets the data in natural/ascending order
		SortedSet<String> ts = new TreeSet<String>();
		System.out.println(ts);//[]

		// Adding elements into the TreeSet using add()
		ts.add("India");
		ts.add("Australia");
		ts.add("South Africa");
		
		System.out.println("Set after adding elements, will in ascending order: "+ts);

		// Adding the duplicate element
		ts.add("India");

		// Displaying the TreeSet - In Ascending order
		System.out.println("Set after duplication of data, will in ascending order: "+ts);
		
		// Displaying the TreeSet Size
		System.out.println("Size of the set is "+ts.size()); //3

		// Removing items/elements from TreeSet using remove(element value)
		boolean val = ts.remove("Australia");
		System.out.println("True if removed: "+val);
		
		System.out.println("Set after removing " + "Australia:" + ts); //[India, South Africa]

		
		System.out.println("*****************While Loop***************");
		// Iterating over Tree set items
		System.out.println("Iterating over set:");
		Iterator<String> i = ts.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("*******************For Each Loop*********************");
		for(String str:ts) {
			System.out.println(str);
		}
		
		


	}

}

