package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListCustomizedSortingLambda {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(2);
		a1.add(3);
		a1.add(1);
		a1.add(20);
		
		System.out.println(a1);
		
		//Natural Sorting
		Collections.sort(a1);
		System.out.println("Default/Natural/Ascending order of Sorting: "+a1);
		
		// Customized sorting using Lambda Expression - 
		// Using lambda expression in place of comparator object
		//Lambda Expression is for body of compare method of Comparator interface
		//( o1,  o2) -> (o1 < o2) ? -1 :(o1 > o2) ? 1 : 0  - Ascending order
		//( o1,  o2) -> (o1 < o2) ? 1 :(o1 > o2) ? -1 : 0 - Descending order
		
		Collections.sort(a1, ( o1,  o2) -> (o1 < o2) ? -1 :(o1 > o2) ? 1 : 0);
		System.out.println("Ascending order of  Sorting: "+a1);
		
		Collections.sort(a1, ( o1,  o2) -> (o1 < o2) ? 1 :(o1 > o2) ? -1 : 0);
		System.out.println("Descending order of  Sorting: "+a1);
		

	}
	
//
	

	

}




