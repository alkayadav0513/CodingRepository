package stringUnderstanding;

public class EqualityOperator {

	public static void main(String[] args) {
		String str1 = "welcome";
		String str2 = "Welcome";
		String str3 = "Welcome";
		String str4 = new String("welcome");
		String str5 = new String("Welcome");
		String str6 = new String("Welcome");
		
		System.out.println("****Equality Operator********");
		//Compare Strings
		/*Equality Operator - we check where the object is generated?
		 * are the objects same?
		 * are the objects different
		 * 
		 * We do comparison of objects references and where it is created.
		 * We are not comparing the character by character.
		 */
		
		//Objects are different, but generated in constant pool area  - false
		//str1 object in constant pool with value "welcome"
		//str2 object in constant pool with value "Welcome"
		//str1 and str2 are referring different objects , so false
		System.out.println(str1==str2); //false
		
		//Objects are different, but generated in constant pool area  - false
		//"Welcome" is already present in constant pool area. 
		//No new object generated for str3.
		//str3 will refer the same object as str2
		//str2 object in constant pool with value "Welcome"
		//str3 with object in constant pool has value "Welcome"
		//str1 with object in constant pool has value "welcome"
		//str1 and str3 are referring different objects
		System.out.println(str1==str3); //false
		
		
		
		//Objects are different, one in constant pool and one in heap memory  - false
		//str1 object is in constant pool with value "welcome"
		//str4 object is in heap memory space with value "welcome"
		//Since objects are created in different area with different objects so false
		System.out.println(str1==str4); //false
		
		
		//Objects are different, one in constant pool and one in heap memory  - false
		//str1 object is in constant pool with value "welcome"
		//str5 object is in heap memory space with value "Welcome"
		//Since objects are created in different area with different objects so false
		System.out.println(str1==str5); //false
		
		
		//Objects are different, one in constant pool and one in heap memory  - false
		//str1 object is in constant pool with value "welcome"
		//str6 object is in heap memory space with value "Welcome"
		//Since objects are created in different area with different objects so false
		System.out.println(str1==str6); //false
					
		System.out.println("*********");
		//Both objects are in constant pool area, with different value and so objects are different
		//str1 object in constant pool with value "welcome"
		//str2 object in constant pool with value "Welcome"
		//str1 and str2 are referring different objects , so false
		System.out.println(str2==str1);  //false
		
		
		//Same object in constant pool is referred by str2 and str3 - true
		//str2 object  created in constant pool with value "Welcome"
		//str3 has the same value "Welcome" as str2
		//str3 will refer the same object as str2, as str3 has the same as str2
		System.out.println(str2==str3);//true
		
		
		//Objects are different, one in constant pool and one in heap memory  - false
		//Str2 object in constant pool with values as Welcome
		//Str4 object in heap memory space  with values as welcome
		//Since objects of str2 and str4 are in different area and they are different objects so false
		System.out.println(str2==str4); //false
		
		
		//Objects are different, one in constant pool and one in heap memory  - false
		System.out.println(str2==str5); //false
		
		
		//Objects are different, one in constant pool and one in heap memory  - false
		System.out.println(str2==str6); //false
		
		System.out.println("*********");
		//Same object in constant pool is referred by str2 and str3 - true
		//str3 and str2 refer the same object with value "Welcome"
		System.out.println(str3==str2); //true
		
		//Objects are different, one in constant pool and one in heap memory  - false
		//str3 and str4 refer the different object.
		//str3 value is "Welcome"
		//str4 value is "welcome"
		System.out.println(str3==str4); //false
		
		//Objects are different, one in constant pool and one in heap memory  - false
		System.out.println(str3==str5); //false
		
		//Objects are different, one in constant pool and one in heap memory  - false
		System.out.println(str3==str6); //false
		
		System.out.println("*********");
		//Value are different, objects are different but object created in heap memory-  false
		System.out.println(str4==str5); //false
		
		//Value are different, objects are different but object created in heap memory-  false
		System.out.println(str4==str6); //false
		
		System.out.println("*********");
		//Value are same, objects are different but object created in heap memory-  false
		System.out.println(str5==str6); //false
		
	}

}