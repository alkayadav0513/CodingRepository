package predicateUnderstanding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;


public class WithPredicate2 {

	public static void main(String[] args) {
		
		
		Predicate<Integer> p1 = a -> a>10;
		System.out.println(p1.test(100)); //true
		System.out.println(p1.test(9)); //false
		
		System.out.println("*******************************");


		//To check the length of the String is greater than 5
		//Predicate<String>p =  s -> s.length() ; //Not returning a boolean value
		Predicate<String>p =  s -> s.length()>5 ;
		
		System.out.println(p.test("Hello")); //false
		System.out.println(p.test("Not good to use")); //true
		
		System.out.println("************************");
		
		//To check if a collection is empty
		ArrayList<String> a = new ArrayList<String>();
		//Add items to list
		a.add("kaushik");
		
		Predicate<ArrayList<String>> p2 =  a1 -> a1.contains("kaushik");
		System.out.println(p2.test(a)); //True
		
		Predicate<ArrayList<String>> p3 =  c -> c.isEmpty();
		System.out.println(p3.test(a)); //false
		
		
		System.out.println("************************");
		
		ArrayList<String>a1 = new ArrayList<String>();
		
		a1.add("Kaushik");
		a1.add("Sam");
		
		Predicate<ArrayList<String>> p4 = d -> d.contains(a1.get(0));
		System.out.println(p4.test(a1));//true
		
		Predicate<ArrayList<String>> p5 = d -> d.contains("sam");
		System.out.println(p5.test(a1));//false
		
		Predicate<ArrayList<String>> p6 = d -> d.contains("Sam");
		System.out.println(p6.test(a1));//true
		

	}

}
