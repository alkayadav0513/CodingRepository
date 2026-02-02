package sorting;

import java.util.TreeSet;

public class TreeSetNaturalCustomizedSortingLambda {

	public static void main(String[] args) {


		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(10);
		t1.add(2);
		t1.add(3);
		t1.add(1);
		t1.add(20);
		
		//Natural Sorting
		System.out.println("Natural Sorting :"+t1);
		
		//Not Invoking of Lambda Expression with method
		//Calling the Lambda expression with Comparator interface 
		//(o1,o2)->(o1 > o2) ? 1 :(o1 < o2) ? -1 : 0 - Ascending order Ternary operator
		TreeSet<Integer> t2 = new TreeSet<Integer>((o1,o2) -> (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0 );
		t2.add(10);
		t2.add(2);
		t2.add(3);
		t2.add(1);
		t2.add(20);
		
		//customized Sorting - Lambda
		System.out.println("Ascending order:"+ t2);
		
		//Calling the Lambda expression with Comparator interface 
		//(o1,o2)->(o1 > o2) ? -1 :(o1 < o2) ? 1 : 0 - Descending order Ternary operator
		TreeSet<Integer> t3 = new TreeSet<Integer>((o1,o2) -> (o1 > o2) ? -1 :(o1 < o2) ? 1 : 0);
		t3.add(10);
		t3.add(2);
		t3.add(3);
		t3.add(1);
		t3.add(20);
		
		//customized Sorting - Lambda
		System.out.println("Descending order:"+ t3);
		

	}

}
