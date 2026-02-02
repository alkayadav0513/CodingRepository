package sorting;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapNaturalCustomizedSortingLambda {

	public static void main(String[] args) {


		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		t1.put(900, "Rahul");
		t1.put(600, "Sunny");
		t1.put(300, "Roger");
		t1.put(200, "Moore");
		t1.put(800, "Ralf");
		
		//natural Sorting  based on KEY
		System.out.println("Natural/Ascending Sorting: "+t1);
		

		//Not Invoking of Lambda Expression with method
		//Calling the Lambda expression with Comparator interface
		//(o1 > o2) ? -1 :(o1 < o2) ? 1 : 0 - Descending order Ternary operator
		TreeMap<Integer, String> t2 = new TreeMap<Integer, String>((o1,o2) -> (o1 > o2) ? -1 : (o1 < o2) ? +1 : 0);
		t2.put(900, "Rahul");
		t2.put(600, "Sunny");
		t2.put(300, "Roger");
		t2.put(200, "Moore");
		t2.put(800, "Ralf");
		
		//Descending order Sorting - Lambda
		System.out.println(t2);
		
		//Not Invoking of Lambda Expression with method
		//Calling the Lambda expression with Comparator interface
		//(o1 > o2) ? 1 :(o1 < o2) ? -1 : 0 -> Ascending order Ternary operator
		TreeMap<Integer, String> t3 = new TreeMap<Integer, String>((o1,o2) -> (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0);
		t3.put(900, "Rahul");
		t3.put(600, "Sunny");
		t3.put(300, "Roger");
		t3.put(200, "Moore");
		t3.put(800, "Ralf");
				
		//Ascending order Sorting - Lambda
		System.out.println(t3);
		
		

	}

}
