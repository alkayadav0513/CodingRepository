package stringUnderstanding;



import java.util.Date;

public class MethodsString {

	public static void main(String[] args) {
		String str1 = "Learning Java";
		//-------------Learning J a  v  a
		//-------------0123456789 10 11 12
		
		//Character at index 5
		char c1 = str1.charAt(5);
		System.out.println(c1);//i
		
		//Syntax error - StringIndexOutOfBoundsException class is a child of IndexOutOfBoundaryException class
		//char c11 = str1.charAt(-1); 
		//System.out.println(c11);
		
		//Syntax error - StringIndexOutOfBoundsException class is a child of IndexOutOfBoundaryException class
		//char c12 = str1.charAt(13); 
		//System.out.println(c12);
		
		//Character at index 12
		char c2 = str1.charAt(12);
		System.out.println(c2);//a
		
		//Character at index 1
		char c3 = str1.charAt(1);
		System.out.println(c3);//e
		
		//Character at index 10
		char c4 = str1.charAt(10);
		System.out.println(c4);//a
		
		System.out.println("***********length() - returns length of string**********************");
		//String str1 = "Learning Java";
		//  -------------Learning J a  v  a
		//  -------------0123456789 10 11 12
		
		//Length of "Learning Java"
		int lengthString = str1.length();
		System.out.println("Length  of the String is "+lengthString);//13

		System.out.println("**********format() method*********");
		//Concatenation technique - Concatenation Operator, concat() 
		String s4 = new String("Hello ");
		String s5 = new String("Learning ");
		String s6 = new String("Java.");
		String s66 = new String("Good to learn..");
		
		//%s --> Formatter used for string
		String s7 = String.format("%s%s%s%s", s4,s5,s6, s66);
		System.out.println(s7);//Hello Learning Java.Good to learn..
		
		String s77 = String.format("%s%s%s", s6, s4, s66);
		System.out.println(s77);//Java.Hello Good to learn..
		
		System.out.println("************subString()*********************");
		//subString(int index) - substring starting with the index defined until the last character
		String str2 = "Learning Java";
		//-------------Learning J a  v  a
		//-------------0123456789 10 11 12
		String str3 = str2.substring(6); //Print all characters from index number 6 onwards
		System.out.println(str3);//ng Java
		
		String str4 = str2.substring(9);//Print all characters from index number 9 onwards
		System.out.println(str4);//Java
		
		/*subString(int beginIndex, int lastIndex) - substring starting 
		with the beginIndex until character at lastIndex-1*/
		
		String str5 = str2.substring(9, 12);
		System.out.println(str5);//Jav
		
		String str6 = str2.substring(3, 9);
		System.out.println(str6);//rning 
		
		String str7 = str2.substring(3, 10);
		System.out.println(str7);//rning J
		
		System.out.println("************contains()*********************");
		//Will throw true if character present in String
		//Will throw false if character is not present in String
		String str8 = "Learning Python";
		boolean b1 = str8.contains("Py");
		System.out.println(b1); //true
		
		boolean b11 = str8.contains("Pp");
		System.out.println(b11); //false
		
		boolean b2 = str8.contains("p");
		System.out.println(b2); //false

		boolean b3 = str8.contains("Z");
		System.out.println(b3); //false
		
		boolean b4 = str8.contains("L");
		System.out.println(b4); //true
		
		boolean b5 = str8.contains("Pi");
		System.out.println(b5); //false
		
		boolean b6 = str8.contains("P");
		System.out.println(b6); //true
		
		System.out.println("************join()*********************");
		//Another method to concatenate - format(), concat(), concatenation operator
		
		String s8 = new String("Hello ");
		String s9 = new String("Learning ");
		String s10 = new String("Java.");
		String s11 = new String(" It is good");
		
		String s12 = String.join("--", s8,s9,s10,s11);
		System.out.println(s12);//Hello --Learning --Java.-- It is good
		
		String s13 = String.join("", s8,s9,s10,s11);
		System.out.println(s13);//Hello Learning Java. It is good
		
		String s14 = String.join("-", s9,s8,s10);
		System.out.println(s14);//Learning -Hello -Java.
		
		String s15 = String.join("", s9,s8,s10,s11);
		System.out.println(s15);//Learning Hello Java. It is good
		
		System.out.println("*****************equals() method - content comparison******************");
		/*Content comparison is done based on cases(upper case or lower case), Character 
		and the sequence of characters.*/
		
		//String literals - creates object in constant pool area
		String str11 = "Welcome"; 
		String str21 = "Welcome"; 
		String str31 = "welcome";
		  
		//Object of the String class using "new" keyword - creates object in heap memory space
		String str41 = new String("Welcome"); 
		String str51 = new String("Welcome");
		String str61 = new String("welcome");
		 
		System.out.println(str11.equals(str21) ); //true
		System.out.println(str21.equals(str11)); //true
		System.out.println(str11.equals(str31)); //false
		System.out.println(str31.equals(str11)); //false
		System.out.println(str11.equals(str41)); //true		
		System.out.println(str41.equals(str11));//true				
		System.out.println(str51.equals(str11)); //true		
		System.out.println(str11.equals(str61));//false
		System.out.println(str61.equals(str11)); //false		
		System.out.println(str21.equals(str31));//false		
		System.out.println(str41.equals(str51)); //true		
		System.out.println(str51.equals(str61));//false		
		System.out.println(str41.equals(str61));//false
		
		System.out.println("*****************equalsIgnoreCase() method - ignore case sensitivity******************");
		/*Content comparison is done based Character 
		and the sequence of characters.*/
		/*
		 * String literals - creates object in constant pool area
		String str11 = "Welcome"; 
		String str21 = "Welcome"; 
		String str31 = "welcome";
		  
		//Object of the String class using "new" keyword - creates object in heap memory space
		String str41 = new String("Welcome"); 
		String str51 = new String("Welcome");
		String str61 = new String("welcome");
		 * 
		 */
		
		System.out.println(str11.equalsIgnoreCase(str21) ); //true
		System.out.println(str21.equalsIgnoreCase(str11)); //true
		System.out.println(str11.equalsIgnoreCase(str31));//true
		System.out.println(str31.equalsIgnoreCase(str11));//true
		System.out.println(str11.equalsIgnoreCase(str41)); //true		
		System.out.println(str41.equalsIgnoreCase(str11));//true				
		System.out.println(str51.equalsIgnoreCase(str11)); //true		
		System.out.println(str11.equalsIgnoreCase(str61));//true
		System.out.println(str61.equalsIgnoreCase(str11));//true	
		System.out.println(str21.equalsIgnoreCase(str31));//true	
		System.out.println(str41.equalsIgnoreCase(str51)); //true		
		System.out.println(str51.equalsIgnoreCase(str61));//true
		System.out.println(str41.equalsIgnoreCase(str61));//true
		
		System.out.println("*****************isEmpty()********************");
		String str12 = " "; //Space is also considered as a character. Not empty string
		String str13 = ""; //Empty String
		String str14 = "hi";
		
		boolean b7 = str12.isEmpty();
		System.out.println(b7); //false
		
		boolean b8 = str13.isEmpty();
		System.out.println(b8); //true
		
		boolean b9 = str14.isEmpty();
		System.out.println(b9); //false
		
		System.out.println("*****************concat()********************");
		//String concatenation by  - Concatenation operator, format(), join(), concat()
		
		String str15 = "Hi!";
		String str16 = str15.concat("Learning Python");
		System.out.println(str15); //Hi!
		System.out.println(str16);//Hi!Learning Python
		
		System.out.println("*****************replace()********************");
		//Replaces an old char with new char OR
		//Replace a old charSequanrce with new charSequence
		String str17 = "Learning Python is good.Learn";
		
		String str18 = str17.replace("n", "N");
		System.out.println(str18); //LearNiNg PythoN is good.LearN
		
		String str19 = str17.replace("ar", "AR");
		System.out.println(str19); //LeARning Python is good.LeARn
		
		Date d = new Date();
		System.out.println(d);	//Current Date with time stamp in Date format
		System.out.println(d instanceof Date);//true
		
		//Convert from Date format to String format
		String dateStringFormat = d.toString();
		System.out.println(dateStringFormat);//Current Date with time stamp in String format
		//System.out.println(dateStringFormat instanceof Date);
		System.out.println(dateStringFormat instanceof String);//true
		String replacedChar = dateStringFormat.replace(" ", "_").replace(":", "_");
		System.out.println(replacedChar);
		
		
		
		
		System.out.println("*****************split()********************");
		String str20 = "Learning Python is good";
		String [] str22= str20.split(" ");
		System.out.println(str22.length); //4
		//For loop
		for(int index = 0; index<str22.length; index++) {
			System.out.println(str22[index]);//1. Learning   2.Python 3.is 4.good 
		}
		System.out.println("****");
		//For Each loop
		for(String str23:str22){
			System.out.println(str23);
		}
		
		System.out.println("****");
		
		String []  str23= str20.split("P");
		System.out.println(str23.length);//2
		//For loop
		for(int x = 0; x<str23.length; x++) {
			System.out.println(str23[x]); //First value: Learning  ,Second Value:ython is good
		}
		
		System.out.println("*****************index()********************");
		
		String str24 = "Learning Java";
		//-------------Learning J a  v  a
		//-------------0123456789 10 11 12
		
		//Index of first occurrence of "a" from LHS
		int a1 = str24.indexOf("a");
		System.out.println(a1);//2
		
		//Index of first occurrence of "a" from LHS
		int a2 = str24.indexOf("a", 0);//Start searching "a" from index number 0 until last
		System.out.println(a2);//2
		
		//Index of first occurrence of "a" from LHS
		int a3 = str24.indexOf("a", 1);//Start searching "a" from index number 1 until last
		System.out.println(a3);//2
		
		//Index of first occurrence of "a" from LHS
		int a4 = str24.indexOf("a", 2);//Start searching "a" from index number 2, At index 2 , "a" is present
		System.out.println(a4);//2
		
		System.out.println("********");
		//String str24 = "Learning Java";
		//-------------Learning J a  v  a
		//-------------0123456789 10 11 12
		//Index of second occurrence of "a" from LHS
		
		int a5 = str24.indexOf("a", 3);//Start searching "a" from index number 3 until last, 
		System.out.println(a5);//10
		
		int a6 = str24.indexOf("a", 4);//Start searching "a" from index number 4 until last, 
		System.out.println(a6);//10
		
		int a7 = str24.indexOf("a", 5);//Start searching "a" from index number 5 until last, 
		System.out.println(a7);//10
		
		int a8 = str24.indexOf("a", 6);//Start searching "a" from index number 6 until last, 
		System.out.println(a8);//10
		
		int a9 = str24.indexOf("a", 7);//Start searching "a" from index number 7 until last, 
		System.out.println(a9);//10
		
		int a10 = str24.indexOf("a", 8);//Start searching "a" from index number 8 until last, 
		System.out.println(a10);//10
		
		int a11 = str24.indexOf("a", 9);//Start searching "a" from index number 9 until last, 
		System.out.println(a11);//10
		
		int a12 = str24.indexOf("a", 10);//Start searching "a" from index number 10, at index 10, "a" is present
		System.out.println(a12);//10
		
		
		System.out.println("********");
		//String str24 = "Learning Java";
		//-------------Learning J a  v  a
		//-------------0123456789 10 11 12
		//Index of last occurrence of "a" from LHS
		int a13 = str24.indexOf("a", 11);//Start searching "a" from index number 11 until last, 
		System.out.println(a13);//12
		
		int a14 = str24.indexOf("a", 12);//Start searching "a" from index number 12, 
		System.out.println(a14);//12
		
		System.out.println("********");
		int a15 = str24.indexOf("Z", 0);//Start searching "Z" from index number 0, and there is no char called "Z" and so will give -1
		System.out.println(a15);//-1
		
		int a16 = str24.indexOf("q", 13);//Start searching "a" from index number 13, and there is no index number 13 and so will give index value as -1
		System.out.println(a16);//-1
		
		System.out.println("*****************toLowercase()********************");
		String str25 = "Learning Java";
		
		String str26 = str25.toLowerCase();
		System.out.println(str26);//learning java
		
		System.out.println("*****************toUppercase()********************");
		String str27 = "Learning Java";
		
		String str28 = str27.toUpperCase();
		System.out.println(str28);//LEARNING JAVA
		
		System.out.println("*****************trim()********************");
		/*Is used to trim white spaces before or after a string value. In between a string,
		if there is a white space, that will not be trimmed*/
		
		String str29 = " Learning Java ";
		String str30 = str29.trim();
		System.out.println(str30);//Learning Java
		
		System.out.println(str29);
		
		System.out.println("************************");
		String str32 = "Hey!! Learning Java.";
		MethodsString.searchChar(str32, "A");
		MethodsString.searchChar(str32, "L");
		MethodsString.searchChar(str32, "R");
		
	}
	
	public static void searchChar(String str, String charToSearch) {
		int indexNum = str.indexOf(charToSearch);
		if(indexNum == -1) {
			System.out.println(charToSearch+" is not present in the String value");
		}else {
			System.out.println(charToSearch+" is present in the String value");
		}
	}

}
