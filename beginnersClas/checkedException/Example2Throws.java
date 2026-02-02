package checkedException;

public class Example2Throws {
	
	//UNCAUGHT EXCEPTION

	public static void main(String[] args) throws ArithmeticException, NumberFormatException,StringIndexOutOfBoundsException{
		
		/*
		 * INFERENCES:
		 * 
			1)Do not handle a UNCAUGHT EXCEPTION using THROWS CLAUE
		*
		*/

		System.out.println("************Arithmetic Exception - divide by 0**************");
		
			System.out.println("Before Exception caught");
			int a = 20;
			int b = 10;
			int c = a/b;
			System.out.println(c);
			System.out.println("After Exception caught");
		
		
		System.out.println("Line of code after try block  - 1");
		System.out.println("********");
		
		
			System.out.println("Before Exception caught");
			int a1 = 20;
			int b1 = 0;
			int c1 = a1/b1;
			System.out.println(c1);
			System.out.println("After Exception caught");
		
		
		System.out.println("Line of code after try block  - 2");
		
		System.out.println("************NUMBER FORMAT EXCEPTION**************");
		
		
			String str = "120";
			int i1 = Integer.parseInt(str);
			System.out.println(i1);
			
			String str1 = "#";
			int i2 = Integer.parseInt(str1);
			System.out.println(i2);
		
		
		System.out.println("Line of code after try block  - 3");
		
		System.out.println("************String Index Out of Boundary Exception**************");
		
			String str2 = "Hello";
			char ch = str2.charAt(-1);
			System.out.println(ch);
		
		
		System.out.println("Line of code after try block  - 4");
		
	}

}
