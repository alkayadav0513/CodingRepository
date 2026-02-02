package uncheckedException;


public class Example2Throws {
	
	//UNCAUGHT EXCEPTION

	public static void main(String[] args) throws ArithmeticException, NumberFormatException,StringIndexOutOfBoundsException, InterruptedException{
		
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
		//int b1 = 0;
		int b1 = 10;
		int c1 = a1/b1;
		System.out.println(c1);
		System.out.println("After Exception caught");
		
		
		System.out.println("Line of code after try block  - 2");
		
		System.out.println("************NUMBER FORMAT EXCEPTION**************");
		
		
		String str = "120";
		int i1 = Integer.parseInt(str);
		System.out.println(i1);
			
		//String str1 = "#";
		String str1 = "12";
		int i2 = Integer.parseInt(str1);
		System.out.println(i2);
		
		
		System.out.println("Line of code after try block  - 3");
		
		System.out.println("************String Index Out of Boundary Exception**************");
		
		String str2 = "Hello";
		//char ch = str2.charAt(-1);
		char ch = str2.charAt(0);
		System.out.println(ch);
		
		
		System.out.println("Line of code after try block  - 4");
		
		System.out.println("******************");
		//Calling the timePrint() method in main method
		/*Calling the timePrint() method in main method will invoke InterruptedException in \
		main method.a And so we have to exclusively handle the same exception specifically for
		main method.*/
		Example2Throws.timeprint();
		
		System.out.println("******************");
		//Calling the ExampleNullPointerException() method in main method
		/*Calling the ExampleNullPointerException() method in main method will not invoke 
		 * Null Pointer Exception in main method.a And so we do not have to exclusively 
		 * handle the same exception specifically for main method.*/
		Example2Throws e1 = new Example2Throws();
		e1.ExampleNullPointerException();
		
		
		
	}
	
	// This behaviour is applicable to runtime exception and compile time exception
	//The throws clause is able to handle InterruptedException in the timePrint() method
	public static void timeprint() throws InterruptedException {
		int a = 10;
		System.out.println(a);
		
		Thread.sleep(2000L);
		
		int b = 20;
		System.out.println(b);
	}
	
	
	//NullPointerException - a runtime exception
	public void ExampleNullPointerException() {
		try {
			int a[] = null;
			//Developer has forgotten this code as below:
			//a = new int[3];
			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			
			for(int b: a) {
				System.out.println(b);
			}
		}catch(NullPointerException n) {
			//n.printStackTrace();
			System.out.println("This is the catch block.");
		}
		
		
		
	}
	
	

}
