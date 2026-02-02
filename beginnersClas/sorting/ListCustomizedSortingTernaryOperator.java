package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListCustomizedSortingTernaryOperator implements Comparator<Integer>{

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(2);
		a1.add(3);
		a1.add(1);
		a1.add(20);
		
		System.out.println(a1);
	
		//With out Lambda - Descending order sorting
		Collections.sort(a1, new ListCustomizedSortingTernaryOperator());
		System.out.println("Ascending Order"+ a1);
		//System.out.println("Descending Order"+ a1);

	}

	@Override
	public int compare(Integer o1, Integer o2) {
		//Descending order
		//return (o1 > o2) ? -1 :(o1 < o2) ? 1 : 0;
		
		//Ascending order
		return (o1 > o2) ? 1 :(o1 < o2) ? -1 : 0;
	}
}
