package predicateUnderstanding;

import java.util.function.Predicate;

public class Program6 {

	public static void main(String[] args) {
		//Program to display names starts with 'K' by using Predicate 
		
		String[] names={"Sunny","Kamala","Molly","Kunal","Kareena"}; 
		Predicate<String> startsWithK=  s->s.charAt(0)=='K'; 
		System.out.println("The Names starts with K are:"); 
		
		for(String s: names) { 
			if(startsWithK.test(s)) { 
				System.out.println(s); 
			} 
		} 


	}

}

