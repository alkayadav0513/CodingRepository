package checkedException;

public class Example2TryCatch {
	
	//UNCAUGHT EXCEPTION

	public static void main(String[] args) {
		
		/*
		 * INFERENCES:
		 * 1) If the try block has exception line, exception is caught and 
		 * the compiler moves control in catch block . Should 
		 * execute catch block and then the lines of codes after TRY CATCH BLOCK get executed.
		 * 2) If the try block has no exception line, compiler will
		 * ignore the CATCH block . It will execute the lines of codes after TRY CATCH BLOCK.
		 * 3) Catch block codes works for uncaught exception
			4)The codes before the exception  gets compiled.And the codes after
			exception line does not get compiled
		*
		*/

		System.out.println("************Arithmetic Exception - divide by 0**************");
		try {
			System.out.println("Before Exception caught");
			int a = 20;
			int b = 10;
			int c = a/b;
			System.out.println(c);
			System.out.println("After Exception caught");
		}catch(ArithmeticException a) {
			//The name of exception handled, message of exception and line number which has exception
			a.printStackTrace();
			
			//Method which gives only the message of exception
			String msg = a.getMessage();
			System.out.println(msg);
		}
		
		System.out.println("Line of code after try block  - 1");
		System.out.println("********");
		
		try {
			System.out.println("Before Exception caught");
			int a = 20;
			int b = 0;
			int c = a/b;
			System.out.println(c);
			System.out.println("After Exception caught");
		}catch(ArithmeticException a) {
			//The name of exception handled, message of exception and line number which has exception
			a.printStackTrace();
			
			//Method which gives only the message of exception
			String msg = a.getMessage();
			System.out.println(msg);
			
			int c = 90;
			System.out.println(c);
		}
		
		System.out.println("Line of code after try block  - 2");
		
		System.out.println("************NUMBER FORMAT EXCEPTION**************");
		
		try {
			String str = "120";
			int i1 = Integer.parseInt(str);
			System.out.println(i1);
			
			String str1 = "#";
			int i2 = Integer.parseInt(str1);
			System.out.println(i2);
		}catch(NumberFormatException n) {
			//The name of exception handled, message of exception and line number which has exception
			n.printStackTrace();
			
			//Method which gives only the message of exception
			String msg = n.getMessage();
			System.out.println(msg);
		}
		
		System.out.println("Line of code after try block  - 3");
		
		System.out.println("************String Index Out of Boundary Exception**************");
		try {
			String str2 = "Hello";
			char ch = str2.charAt(-1);
			System.out.println(ch);
		}catch(StringIndexOutOfBoundsException s) {
			//The name of exception handled, message of exception and line number which has exception
			s.printStackTrace();
			
			//Method which gives only the message of exception
			String msg = s.getMessage();
			System.out.println(msg);
		}
		
		System.out.println("Line of code after try block  - 4");
		
	}

}
