package sortingArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Example {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Kaushik");
		a1.add("Aman");
		a1.add("Zion");
		a1.add("Barbara");
		
		
		System.out.println("List before sorting: "+a1);
		
		for(String s1:a1) {
			System.out.println(s1);
		}
		
		
		
		System.out.println("***************Ascending/Natural Order**********************");
		//Ascending order sorting
		//For alphabets it is from a-z
		//For numbers , it is from 0 to 9
		Collections.sort(a1);
		System.out.println("List after sorting naturally/ascending order: "+a1);
		for(String s1:a1) {
			System.out.println(s1);
		}
			

		System.out.println("***************Descending Order**********************");
		//Descending order sorting
		//For alphabets it is from z-a
		//For numbers , it is from 9 to 0
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("List after sorting in descending  order: "+a1);
		
		System.out.println("******For Each loop  - Descending order*******");
		for(String s1:a1) {
			System.out.println(s1);
		}
		
		System.out.println("******For loop  - Descending order*******");
		for(int x = 0; x<a1.size(); x++) {
			System.out.println(a1.get(x));
		}
				
		System.out.println("******While loop  - Descending order*******");
		int a = 0; //index number of the arraylist items
		while(a<a1.size()) {
			System.out.println(a1.get(a));
			a++; 
		}
		
		//a1 = [Zion, Kaushik, Barbara, Aman]
		System.out.println("***************listIterator()"
				+ "decending order - to traverse list in "
				+ "forward(LHS to RHS) or backward (RHS to LHS) direction*********************");
		System.out.println("List after sorting in descending  order: "+a1);
		ListIterator<String> lIter = a1.listIterator();
		//a1 = [Zion, Kaushik, Barbara, Aman]
		//Forward direction means from left to right  - [Zion, Kaushik, Barbara, Aman]
		System.out.println("List in forward direction: ");
		while(lIter.hasNext()) {
			System.out.println(lIter.next());
		}
		
		//a1 = [Zion, Kaushik, Barbara, Aman]
		//Backward direction means from left to right  - [Aman, Barbara, Kasuhik, Zara]
		System.out.println("List in backward direction: ");
		while(lIter.hasPrevious()) {
			System.out.println(lIter.previous());
		}
		
		System.out.println("***************iterator()*********************");
		System.out.println("List after sorting in descending  order: "+a1);
		
		//Forward direction means from left to right  - [Zion, Kaushik, Barbara, Aman]
		System.out.println("List in forward direction: ");
		Iterator<String> iter = a1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}

}
