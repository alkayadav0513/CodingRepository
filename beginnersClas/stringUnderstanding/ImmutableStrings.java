package stringUnderstanding;

public class ImmutableStrings {

	public static void main(String[] args) {

		// String is an IMMUTABLE class.
		// IMMUTABLE MEANS that the value of a string cannot be modified.
		
		String str = "Welcome!!";
		System.out.println(str); //Welcome!!
		
		/*Can we can change the value of String by using concatenation operator or 
		by using concat method of String class? NO*/
		str.concat("Java Session");
		// Will it throw Welcome!! OR Welcome!!Java Session?
		//It will throw "Welcome!!"
		//Since the value of "str" variable does not change , STRINGS are IMMUTABLE
		System.out.println(str);//Welcome!!
		
		//str +"Hello";  //We want Welcome!!Hello - not allowing as String are immutable
		
		//Re-assign the value of "str" variable with concatenation operator
		str = str +"Hello";	
		System.out.println(str);//Welcome!!Hello
		
		System.out.println("*****************");
		str.concat("Java Session"); //Welcome!!Hello.concat("Java Session");
		System.out.println(str);//Welcome!!Hello
		
		//Re-assign the value of "str" variable with concat method
		str = str.concat("Java Session");
		System.out.println(str); //Welcome!!HelloJava Session
		
		//Put the concatenated value in a different variable of String
		String str1 = str.concat("Java Session"); //Welcome!!HelloJava Session.concat("Java Session")
		System.out.println(str1);//Welcome!!HelloJava SessionJava Session
		
		//Re-assign the value of "str" variable
		str = str +"Hello";	 //Welcome!!HelloJava Session+"Hello";
		System.out.println(str);///Welcome!!HelloJava SessionHello
		
		   System.out.println("*************Mutable class - StringBuilder Class****************");
			StringBuilder stb = new StringBuilder("Hi!");
			System.out.println(stb);//Hi!!
			stb.append("Learning Java");
			System.out.println(stb);//Hi!Learning Java
			
			//Converting StringBuilder to String class
			String str3 = stb.toString();
			System.out.println(str3);//Hi!Learning Java
			str3.concat("It is good");
			System.out.println(str3);//Hi!Learning Java
	}

}
