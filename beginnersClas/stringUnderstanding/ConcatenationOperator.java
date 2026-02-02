package stringUnderstanding;

public class ConcatenationOperator {

	public static void main(String[] args) {

		//Concatenation Operator use the plus (+) sign.
		/* The plus (+) sign acts as a Concatenation Operator when :
		 * 
		 * a) when the  plus (+) sign is preceded by a String 
		 * 
		 * AND/OR
		 * 
		 * b) when the  plus (+) sign is followed by a String 
		 * 
		 * 
		 */
		
		int a = 20;
		double b = 89.0D;
		String str1 = "Welcome!!";
		String str2 = "Learning Python";
		
		System.out.println(a+b+str1+str2); //109.0Welcome!!Learning Python
		//a+b = 20+89.0  = both numbers and so the  plus (+) sign acts as addition operator
		//a+b = 20+89.0 = 109.0
		//a+b+str1 => 109.0+Welcome!! => the  plus (+) sign is followed by string so the  plus (+) sign acts as Concatenation operator
		//a+b+str1 => 109.0+Welcome!! =>109.0Welcome!! (String format)
		//a+b+str1+str2 ==> 109.0Welcome!!+Learning Python => the  plus (+) sign is followed and preceded by string so the  plus (+) sign acts as Concatenation operator
		//a+b+str1+str2 ==> 109.0Welcome!!+Learning Python =>109.0Welcome!!Learning Python(String format)

		
		System.out.println(str1+a+str2+b);//Welcome!!20Learning Python89.0
		//str1+a ==> Welcome!!+20 =  Welcome!!20(String format)
		//str1+a+str2 => Welcome!!20+Learning Python =>Welcome!!20Learning Python (String format)
		//str1+a+str2+b ==> Welcome!!20Learning Python+89.0 ==>Welcome!!20Learning Python89.0 (String format)
		
		
		System.out.println(str2+a+b+str1);//Learning Python2089.0Welcome!!
		//str2+a => Learning Python + 20 =>Learning Python20 (String format)
		//str2+a+b => Learning Python20 + 89.0 => Learning Python2089.0(String format)
		//str2+a+b+str1 => Learning Python2089.0 + Welcome!! =>Learning Python2089.0Welcome!! (String format)
	}

}
