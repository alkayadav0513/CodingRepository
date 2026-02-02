package staticImport;

//Import the static references manually from the System class as we do not get intelli-sense
//import static java.lang.System.*;

//To create intelli-sense to static imports:Window > Preferences > Java > Editor > Content Assist > Favorites
//import static java.lang.System.out;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Example {
	
	

	public static void main(String[] args) {


		//System.out.println("Hello");
		out.println("Welcome");
		
		System.out.println("*************");
		System.out.println("Enter data in console: ");
		Scanner sc = new Scanner(in);
		
		String str = sc.next();
		System.out.println(str);//13
		System.out.println(str instanceof String); //true
		//System.out.println(str instanceof Integer); 
		
		

	}

}
