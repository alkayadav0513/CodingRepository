package searchList;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		//Upcasting
		List<String> a1 = new ArrayList<String>();
		
		System.out.println("***********add()***************");
		//Add() method is to add to the list
		a1.add("Kaushik"); //index number 0
		a1.add("Sam");//index number 1
		a1.add("Robert");//index number 2
		a1.add("Peter");//index number 3
		
		System.out.println("The list is "+a1); //[Kaushik, Sam, Robert, Peter]
		
		System.out.println("***********Search ArrayList - indexOf()*************");
		System.out.println(Example.searchList(a1, "Kunal"));
		System.out.println(Example.searchList(a1, "Sam"));
		
		System.out.println("***********Search ArrayList - contains()*************");
		System.out.println(Example.searchList("Kunal", a1));
		System.out.println(Example.searchList("Sam", a1));


	}
	
	public static int searchList(List<String> l1, String elementValueToSearch) {
		
		if(l1.indexOf(elementValueToSearch)!= -1) {
			System.out.println("Index of the element "+elementValueToSearch+" is :  ");
			return l1.indexOf(elementValueToSearch);
		}else {
			System.out.println("Element "+elementValueToSearch+" does not exist in the list");
			return -1;
		}

		
	}
	
     public static boolean searchList(String elementValueSearch,List<String> l1) {
		
		if(l1.contains(elementValueSearch)) {
			System.out.println("Element "+elementValueSearch+" is present in the list:  ");
			return true;
			
		}else {
			System.out.println("Element "+elementValueSearch+" is not present in the list list");
			return false;
		}

		
	}
	
	

}
