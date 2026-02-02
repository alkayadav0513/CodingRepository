package CollectionsJava;




//1) Would like to import all classes/interface of the java.util package using "*"
import java.util.*;

public class CollectionsClass {

	public static void main(String[] args) {


		/*1) java.util has collection framework and one of the interface in 
		collection framework is List.List interface is implemented by 
		ArrayList, LinkedList, Vector , Stack.
		2) Vector and Stack classes are deprecated.
		3) List interface supports object type and not primitive type
		and this rules comes from collection framework.
		4) List interface supports homogeneous and heterogeneous data and this rule
		come from collection framework.
		5) List supports indexing and supports duplicate data. Indexing starts from 0.
		6) ArrayList, LinkedList, Vector , Stack classes - will follow point 3,4,5 */
		
		//List of heterogeneous data
		//ArrayList<int> a1 = new ArrayList<int>();  /will not support primitive type
		ArrayList<Object> a1 = new ArrayList<Object>();
		System.out.println(a1); //[]
		//Add elements to the list - add();
		a1.add("Kaushik"); //Index number  - 0 
		a1.add("Kaushik"); //Index number  - 1 
		a1.add('M'); //Index number  - 2 
		a1.add(50); //Index number  - 3 
		System.out.println(a1);
		
		//Get the data at index 1
		Object o1 = a1.get(1);
		System.out.println(o1);
		//Get the data at index 3
		Object o2 = a1.get(3);
		System.out.println(o2);
		
		//Get the size of the list
		int sizeList = a1.size();
		System.out.println("Size of the list is "+sizeList);
		
		System.out.println("******For loop*********");
		//Getting all data from the list
		for(int index = 0; index<sizeList; index = index+1) {
			System.out.println(a1.get(index));
		}
		
		System.out.println("******For Each*********");
		for(Object o:a1) {
			System.out.println(o);
		}
		
		System.out.println("*******Iterator********");
		//Iterator method in LIst will iterate from left to right - [Kaushik, Kaushik, M, 50]
		Iterator<Object> iter2 = a1.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		System.out.println("******List iterator*********");
		//List Iterator method in List will iterate from left to right - [Kaushik, Kaushik, M, 50]
		ListIterator<Object> iter3 = a1.listIterator();
		while(iter3.hasNext()) {
			System.out.println(iter3.next());
		}
		
		System.out.println("******List iterator - Righ to left*********");
		//List Iterator method in List will iterate from right  to left - [Kaushik, Kaushik, M, 50]
		//System.out.println(a1);
		ListIterator<Object> iter4 = a1.listIterator(sizeList);
		System.out.println(iter4.previous());
		while(iter4.hasPrevious()) {
			System.out.println(iter4.previous());
		}
		
		
		System.out.println("*********************");
		/*1) java.util has collection framework and one of the interface in 
		collection framework is SET.SET interface is implemented by 
		HashSet, TreeSet, etc..
		2) SET interface supports object type and not primitive type
		and this rules comes from collection framework.
		3) SET interface supports homogeneous and heterogeneous data and this rule
		come from collection framework.
		4) SET does not supports indexing and does not support duplicate data. 
		6) HashSet, TreeSet, classes - will follow point 2,3,4 */
		Set<Integer> s1 = new HashSet<>(); //Upcasting between a class and the interface it implements
		
		//Add data to the set
		s1.add(10);
		//Duplication of data does not show compilation error.
		//The earlier data 10 in line 67 gets lost and the present data 10 in line 70 remains
		s1.add(10);
		s1.add(20);
		s1.add(30);
		
		//Get the size of the Set
		int sizeSet  = s1.size();
		System.out.println("Size of the set is "+sizeSet);
		
		//Get the data - we will get random data from the set
		Iterator<Integer> iter = s1.iterator();
		Integer a2 = iter.next();
		System.out.println(a2);
		System.out.println(iter.next());
		System.out.println(iter.next());
		//Exception - no such element exception as the 4th element not present in set
		//System.out.println(iter.next());
		
		
		System.out.println("***************");
		//Get all data
		Iterator<Integer> iter1 = s1.iterator();
		//hasNext() return TRUE value if there is element in the SET
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		
	}

}
