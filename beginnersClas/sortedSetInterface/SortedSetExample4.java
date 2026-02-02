package sortedSetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

/*Iterating through the SortedSet: There are various ways to iterate through 
the SortedSet. The most famous one is to use the enhanced for loop.*/
public class SortedSetExample4 {

	public static void main(String[] args) {
		
		//Upcasting
		SortedSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("C");
		ts.add("D");
		ts.add("E");
		ts.add("A");
		ts.add("B");
		ts.add("Z");
		
		System.out.println(ts);//[A,B,C,D,E,Z]

		// Iterating though the SortedSet
		//Since TreeSet is used , we see in ascending order the values of FOR EACH loop
		for (String value : ts) {
			System.out.print(value + ", ");
		}
			
		System.out.println();

	}

}

