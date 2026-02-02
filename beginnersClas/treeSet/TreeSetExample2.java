package treeSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*The descendingIterator() method of java.util.TreeSet<E> class is used to return an 
iterator over the elements in this set in descending order.*/

public class TreeSetExample2 {

	public static void main(String[] args) {
		// create tree set object
		TreeSet<Integer> treeadd = new TreeSet<Integer>();

		// populate the TreeSet using add() method
		treeadd.add(10);
		treeadd.add(20);
		treeadd.add(40);
		treeadd.add(30);

		// Print the TreeSet
		System.out.println("TreeSet in ascending order: " + treeadd); //[10,20,30,40]
		System.out.println("Values using Ascending Order:");
		// printing the integrated value - will print values in Ascending
		for(Integer i: treeadd) {
			System.out.print(i+",");
		}
				
		System.out.println();
		

		// Create descending iterator - using descendingIterator() method
		Iterator<Integer> iterator1 = treeadd.descendingIterator();
		
		System.out.println(treeadd);  //[10,20,30,40]

		System.out.println("Values using Descending Order:");

		
		// printing the integrated value - will print values in Descending
		while (iterator1.hasNext()) {
			Integer i1 = iterator1.next();
			System.out.print(i1+",");
		}
		System.out.println();
		
		

	}

}