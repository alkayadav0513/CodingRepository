package Operators;

import java.util.Scanner;

public class ternaryOperator {

	public static void main(String[] args) {
		
		System.out.println("***************if else statement******************");
		//Program 1  - To find even and odd numbers
		int a = 22;
		if(a%2 == 0) {
			System.out.println(a+" is an even number.");
		}else {
			System.out.println(a+" is an odd number.");
		}
		
		System.out.println("************Ternary Operator - ?:   ***************");
		//Ternary operator is used to replace an IF ELSE statement
		//Represented by ?:
		/* Variable = First Operand ? Second Operand : Third Operand
		 * 1) First Operand - Boolean Condition
		 * 2) If the boolean condition is true, then the Second Operand after question 
		 * mark(?) is executed.
		 * 3)If the boolean condition is false, then the third operand after colon(:) 
		 * is executed. 
		 */
		//Program - To find even and odd numbers
		System.out.println("Please enter whole numbers which can be evaluated to odd or even:");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		
		String result = a1%2 == 0 ? a1+" is an even number." : a1+" is an odd number.";
		System.out.println(result);
		
		System.out.println("*******************************");
		//Program 2 = To check is a number is a multiple of 5 and an even number.
		int b1 = 23;
		if(b1%5 == 0 && b1%2 ==0) {
			System.out.println(b1+" is a multiple of 5 and an even number.");
		}else if(b1%5 == 0 && b1%2 != 0){
			//Multiple but odd
			System.out.println(b1+" is a multiple of 5 and but an odd number");
		}else if(b1%5 != 0 && b1%2 ==0) {
			//Not Multiple but even
			System.out.println(b1+" is not a multiple of 5 and but an even number");
		}else if(b1%5 != 0 && b1%2 !=0) {
			//Not Multiple but not even
			System.out.println(b1+" is not a multiple of 5 and but not an even number");
		}
			
		System.out.println("************Ternary Operator - ?:   ***************");
		int b2 = 23;
		String result1 = (b2%5 == 0 && b2%2 ==0) ? 
			(b2+"is a multiple of 5 and an even number."): 
				(b2%5 == 0 && b2%2 != 0) ? b2+" is a multiple of 5 and but an odd number" : 
					(b2%5 != 0 && b2%2 ==0) ? b2+" is not a multiple of 5 and but an even number" : 
						(b2%5 != 0 && b2%2 !=0) ? b2+" is not a multiple of 5 and but not an even number" : 
							b2+" is a multiple of 5 and an even number.";
		System.out.println(result1);
		
		System.out.println("***************If else if statement******************");
		//If we are comparing two entities or less than it, we use if..else statement
		//If we are comparing more than two entities, we use if..else if statement
		//Program 3  - To find lowest among three numbers
		int c = 20;
		long d = 10L;
		double e = 30D;
		
		if(c<d &&  c<e) {
			System.out.println(c+" is the lowest among three numbers");
		}else if(d<c && d<e) {
			System.out.println(d+" is the lowest among three numbers");
		}else if (e<c && e<d){
			System.out.println(e+" is the lowest among three numbers");
		}
		
		if(c<d &&  c<e) {
			System.out.println(c+" is the lowest among three numbers");
		}else if(d<e) {
			System.out.println(d+" is the lowest among three numbers");
		}else{
			System.out.println(e+" is the lowest among three numbers");
		}
		
		
		System.out.println("************Ternary Operator - ?:***************");
		int c1 = 20;
		long d1 = 10L;
		double e1 = 30D;
		String res1 = (c1<d1 &&  c1<e1) ? c1+" is the lowest among three numbers" : 
							(d1<e1) ? d1+" is the lowest among three numbers" : 
								e1+" is the lowest among three numbers";
		System.out.println(res1);
		
		
		
		System.out.println("***************if statement******************");
		//We can have the IF statement without the ELSE part
		//But if there is ELSE, it should be preceded by IF
		//Program 3  - To find if a number is multiple of 4
		int f = 21;
		if(f%4 == 0) {
			System.out.println(f+" is a multiple of 4");
		}
		
		System.out.println("***************Using function in if else statement******************");
		if(multipleOfFour(44)) {
			System.out.println("Number is a multiple of 4");
		}
		
		if(multipleOfFour(45)) {
			System.out.println("Number is a multiple of 4");
		}
		System.out.println("*********");
		if(multipleOfFour(11)) {
			System.out.println("Number is a multiple of 4");
		}else {
			System.out.println("Number is not a multiple of 4");
		}
		
		System.out.println("***************Ternary operator******************");
		String result2 = multipleOfFour(12) ? "Number is a multiple of 4" : 
										"Number is not a multiple of 4";
		System.out.println(result2);
		
		
		
		
	}
	
	/*If a method returns non-void value , the return statement needs 
	to be present in the body of method.*/
	//Return statement should be present as last line of code or the only code
	//Returns statement should return a value which matches with return type of the method.
	public static boolean multipleOfFour(int num) {
		if(num%4 == 0) {
			//System.out.println(num+" is a multiple of 4");
			return true;
		}else {
			//System.out.println(num+" is not a multiple of 4");
			return false;
		}
	}

}

