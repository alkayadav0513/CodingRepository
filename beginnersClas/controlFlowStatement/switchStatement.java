package controlFlowStatement;

//Enumeration are like classes and have attributes and methods.
//Only difference is that enum constants are public, static and final
		
enum Day {
	Monday, 
	Tuesday, 
	Wednesday, 
	Thursday, 
	Friday, 
	Saturday, 
	Sunday;
}

public class switchStatement {
	
	public static void main(String[] args) {
		
		/*switch(Number format, String value, enumeration) {
		
			case literal value or constant:
				System.out.println("Hi");
				a) Break may be present or may not be present for cases
				break;
				b) When the case value matches with switch expression value
				the case body gets executed.
				c) cases should have unique literal value or unique constant
			case literal value or constant:
				System.out.println("Welcome");
				a) Break may be present or may not be present for cases
			default:
				a)Break may be present or may not be present for default.
				b) When non of the cases matches default part gets executed.
				c) We may not have the default part.
				
		}*/
		
		//1. Program to print out vowels and consonant.
		//vowels = a,e,i,o,u
		String alphabetValue = "a";
		
		//No break in cases and no default option.
		/* If the BREAK statement is not used in CASE body and a CASE matches, the body of 
		 * that CASE executes and body of other CASES also executes with the same value. 
		 * Break used - It does break out of switch block if a CASE matches. 
		 */
		
		/*Switch expression cannot have a boolean value. Number formats, 
		String , enumeration allowed.*/
		//Switch can take a String expression
		//a is a vowel  - will be printed 5 times
		switch(alphabetValue) {
		
			//Cases cannot have variable . They will be literal or constant.
			//case alphabetValue:
				//System.out.println(alphabetValue+ "is a vowel");
			
			//The case will not have a break statement. Break statement breaks out of SWITH block
			case "a":
				System.out.println(alphabetValue+ " is a vowel");
				
			//The case values must be unique. In case of duplicate value, it renders compile-time error.
			//case "a":
				//System.out.println(alphabetValue+ "is a vowel");
				
			case "e":
				System.out.println(alphabetValue+ " is a vowel");
			case "i":
				System.out.println(alphabetValue+ " is a vowel");
			case "o":
				System.out.println(alphabetValue+ " is a vowel");
			case "u":
				System.out.println(alphabetValue+ " is a vowel");
			
		}
		
		System.out.println("***************************");
		
		String alphabetValue1 = "e";
		//No break in cases and no default option.
		/* If the BREAK statement is not used in CASE body and a CASE matches, the body of 
		 * that CASE executes and body of other CASES also executes with the same value. 
		 * It does break out of switch block if a CASE matches. 
		 */
		//e is a vowel  - will be printed 4 times
		switch(alphabetValue1) {  //e
		
			case "a":
				System.out.println(alphabetValue1+ " is a vowel");	
			case "e":
				System.out.println(alphabetValue1+ " is a vowel");
			case "i":
				System.out.println(alphabetValue1+ " is a vowel");
			case "o":
				System.out.println(alphabetValue1+ " is a vowel");
			case "u":
				System.out.println(alphabetValue1+ " is a vowel");
			
		}
		
		System.out.println("***************************");
		
		String alphabetValue2 = "i";
		//Break is used in a case whose value is "i" . and no default option.
		//It matches with case values as "i" and breaks out of SWITCH BLOCK
		//i is a vowel  - will be printed 1 time and then it breaks out of SWITCH BLOCK
		switch(alphabetValue2) { //i
		
			case "a":
				System.out.println(alphabetValue2+ " is a vowel");	
			case "e":
				System.out.println(alphabetValue2+ " is a vowel");
			case "i":
				System.out.println(alphabetValue2+ " is a vowel");
				break;
			case "o":
				System.out.println(alphabetValue2+ " is a vowel");
			case "u":
				System.out.println(alphabetValue2+ " is a vowel");
			
		}
		
      System.out.println("***************************");
		String alphabetValue3 = "i";
		//Break is used in a case whose value is "u" . and no default option.
		/* The case with value "i" will match and prints out the body of that case.
		 * It also print out the body of case with value "o" where the print out will be 
		 * "i is a vowel ".
		 *  It also print out the body of case with value "u" where the print out will be 
		 * "i is a vowel ". And then it break out of the SWITCH block.
		 */
		
		//i is a vowel  - will be printed 3 time and then it breaks out of SWITCH BLOCK
		switch(alphabetValue3) { //i
		
			case "a":
				System.out.println(alphabetValue3+ " is a vowel");	
			case "e":
				System.out.println(alphabetValue3+ " is a vowel");
			case "i":
				System.out.println(alphabetValue3+ " is a vowel");
			case "o":
				System.out.println(alphabetValue3+ " is a vowel");
			case "u":
				System.out.println(alphabetValue3+ " is a vowel");
				break;
		}
		
		System.out.println("***************************");
		
		String alphabetValue4 = "i";
		//Break is used in a case whose value is "o" . and no default option.
		/* The case with value "i" will match and prints out the body of that case.
		 * It also print out the body of case with value "o" where the print out will be 
		 * "i is a vowel ". Then it break out of the SWITCH BLOCK>
		 *  
		 */
		//i is a vowel  - will be printed 2 times and then it breaks out of SWITCH BLOCK
		switch(alphabetValue4) { //i
		
			case "a":
				System.out.println(alphabetValue4+ " is a vowel");	
			case "e":
				System.out.println(alphabetValue4+ " is a vowel");
			case "i":
				System.out.println(alphabetValue4+ " is a vowel");
			case "o":
				System.out.println(alphabetValue4+ " is a vowel");
				break;
			case "u":
				System.out.println(alphabetValue3+ " is a vowel");
				
		}
		
		System.out.println("***************************");
		
		String alphabetValue5 = "z";
		//Break is not used in any of the cases and no default option.
		//None of the case matches and nothing gets printed.
		
		switch(alphabetValue5) { //z
		
			case "a":
				System.out.println(alphabetValue5+ " is a vowel");	
			case "e":
				System.out.println(alphabetValue5+ " is a vowel");
			case "i":
				System.out.println(alphabetValue5+ " is a vowel");
			case "o":
				System.out.println(alphabetValue5+ " is a vowel");
			case "u":
				System.out.println(alphabetValue5+ " is a vowel");
		}
		
		System.out.println("***************************");
		
		String alphabetValue6 = "b";
		
		//Break is not used in any of the cases and there is a  default option with break.
		/*None of the case matches . So the default part gets executed and then it breaks out of 
		SWITCH block.*/
		
		switch(alphabetValue6) { //b
		
			case "a":
				System.out.println(alphabetValue6+ " is a vowel");	
			case "e":
				System.out.println(alphabetValue6+ " is a vowel");
			case "i":
				System.out.println(alphabetValue6+ " is a vowel");
			case "o":
				System.out.println(alphabetValue6+ " is a vowel");
			case "u":
				System.out.println(alphabetValue6+ " is a vowel");
			default:
				System.out.println(alphabetValue6+ " is a consonant");
				break;
				
		}
		
		System.out.println("***************************");
		
		String alphabetValue7 = "d";
		
		//Break is not used in any of the cases and there is a  default option without break.
		/*None of the case matches . So the default part gets executed and then the SWITCH 
		 * block is over*/
		
		switch(alphabetValue7) { //d
		
			case "a":
				System.out.println(alphabetValue7+ " is a vowel");	
			case "e":
				System.out.println(alphabetValue7+ " is a vowel");
			case "i":
				System.out.println(alphabetValue7+ " is a vowel");
			case "o":
				System.out.println(alphabetValue7+ " is a vowel");
			case "u":
				System.out.println(alphabetValue7+ " is a vowel");
			default:
				System.out.println(alphabetValue7+ " is a consonant");
				
		}
		
		System.out.println("***************************");
		
		String alphabetValue8 = "u";
		//Break is used in all the cases and there is a  default option without break.
		switch(alphabetValue8) { //u
		
			case "a":
				System.out.println(alphabetValue8+ " is a vowel");	
				break;
			case "e":
				System.out.println(alphabetValue8+ " is a vowel");
				break;
			case "i":
				System.out.println(alphabetValue8+ " is a vowel");
				break;
			case "o":
				System.out.println(alphabetValue8+ " is a vowel");
				break;
			case "u":
				System.out.println(alphabetValue8+ " is a vowel");
				break;
			default:
				System.out.println(alphabetValue8+ " is a consonant");
				
		}
		
		
		System.out.println("***************************");
		/*Switch expression cannot have a boolean value. Number formats, 
		String , enumeration allowed.*/
		//Program  - Program to print if a value is even or odd
		
		int a = 14;
		//switch(a%2 == 0) {  //Switch expression cannot have boolean value
		switch(a%2) {  //0
			case 0:
				System.out.println(a +" is an even number");
				break;
			default:
				System.out.println(a +" is an odd number");
		}
		
		System.out.println("***************************");
		//Program  - Program to print multiple of 3
		int a1 = 8;
		switch(a1%3) {  //0
		case 0:
			System.out.println(a1 +" is a multiple of 3");
			break;
		default:
			System.out.println(a1 +" is not a multiple of 3");
		}
		
		System.out.println("***************************");
		
		System.out.println("**********Switch with enumeration*****************");
		//Program to check that we go to work from Mondays through Friday
		switch(Day.Saturday) {
			case Monday:
				System.out.println(Day.Monday+ ":We are supposed to go to work");
				break;
			case Tuesday:
				System.out.println(Day.Tuesday+ ":We are supposed to go to work");
				break;
			case Wednesday:
				System.out.println(Day.Wednesday+ ":We are supposed to go to work on Wednesday");
				break;
			case Thursday:
				System.out.println(Day.Thursday+ ":We are supposed to go to work");
				break;
			case Friday:
				System.out.println(Day.Friday+ ":We are supposed to go to work");
				break;
			default:
				System.out.println(Day.Saturday+" or "+Day.Sunday+":We are not supposed to go to work");
		}
		
		System.out.println("***************************");
		//Program - Program to check that a number is multiple of 4
		//That number should divided by 4 and should give remainder as zero.
		int num = 17;
		int remainder = num%4;
		switch(remainder) {
			case 0:
				System.out.println(num+" is a multiple of 4");
				break;
			default:
				System.out.println(num+" is not a multiple of 4");
		}
		
		
		
	}

}
