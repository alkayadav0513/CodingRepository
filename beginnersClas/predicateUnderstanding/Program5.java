package predicateUnderstanding;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Program5 {

	public static void main(String[] args) {
		//Predicate to remove null values and empty strings from the given list 
		
		String[] names={"Kaushik","",null,"Ravi","","Shiva",null};	
		
		Predicate<String> p= s -> s != null && s.length()!= 0;
		
		ArrayList<String> list=new ArrayList<String>();
		
		//Iterating over array
		for(String s : names) { 
			if(p.test(s)) { 
				list.add(s); 
			} 
		} 
		System.out.println("The List of valid Names:");
		System.out.println(list);
	


	}
}
