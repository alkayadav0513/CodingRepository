package predicateUnderstanding;

import java.util.function.Predicate;

public class DefaultMethodPredicate4 {

	public static void main(String[] args) {
		//negate() , and(), and or() methods - defsult methods of Predicate
		
		int[] x = {0, 5, 10, 15, 20, 25, 30};
		
		//Predicate to check if number is greater than 10
		Predicate<Integer> p1 = a -> a>10;
		
		
		//Predicate to check if number is even
		Predicate<Integer> p2 = a -> a%2==0;
		
		
		System.out.println("The Numbers Greater Than 10:"); 
		//Calling the m1 function
		m1(p1, x);//15,20,25,30
		
		
		System.out.println("*******************");
		
		System.out.println("The Numbers which are even:"); 
		//Calling the m1 function
		m1(p2,x); //0,10,20, 30
		
		
		System.out.println("*******************");
		
		System.out.println("The Numbers Not Greater Than 11:"); 
		m1(p1.negate(), x); //0,5,10
		
		
		System.out.println("*******************");
		
		System.out.println("The Numbers Greater Than 10 And Even Are:"); 
		m1(p1.and(p2), x);//20, 30
		
		
		System.out.println("*******************");
		
		System.out.println("The Numbers Greater Than 10 OR Even:"); 
		m1(p1.or(p2), x);//0,10, 15, 20, 25, 30


	}
	
	public static void m1(Predicate<Integer>p, int[] x) { 
		for(int x1:x) { 
			if(p.test(x1)) {
				System.out.print(x1+" "); 
			}
		}
		System.out.println();
	}




}
