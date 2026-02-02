package MethodOverloading;

public class Mathematics {
	

	public static void main(String[] args) {
		Mathematics m1 = new Mathematics();
		m1.addition();  //30
		m1.addition(100);//120
		m1.addition(100, 200); //300
		m1.addition("100");//120
		//m1.addition("@@");//Number format exception at line 95 - Exception stops compilation
		m1.addition("200");//220
		m1.addition("1000", "10");//1010
		//m1.addition("1000", "!");//Number format exception at line 105
		m1.addition("12", 20); //32
		m1.addition(110, "10"); //120
		m1.addition(10, 20, 30); //60
		
		

	}
	
	public void addition() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("The first overloading addition method value is "+c);
		
	}
	
	//We cannot achieve overloading by changing the access modifier 
	//Changed from public to default - overloading is not achieved -syntax error
	/*
	 * void addition() { int a = 10; int b = 20; int c = a+b;
	 * 
	 * }
	 */
	
	//We cannot achieve overloading by changing the return type of the method 
	//Changed from void to int - overloading is not achieved -syntax error
	/*public int addition() {
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
		
	}*/
	
	//We cannot achieve overloading by changing name of the method
	//Method name changed from addition to subtraction
	//Non-syntax error - but overloading is not achieved
	/*public void subtraction() {
		int a = 10;
		int b = 20;
		int c = a-b;
		
	}*/
	
	//Changing from static to no-static or vice versa will not achieve overloading
	//Changed from non-static to static  - but overloading is not achieved
	/*public static void addition() {
		int a = 10;
		int b = 20;
		int c = a+b;
		
	}*/
	
	//When number of parameters are different - we can achieve overloading
	public void addition(int a) {
		int b = 20;
		int c = a+b;
		System.out.println("The second overloading addition method value is "+c);
	}
	
	//When number of parameters are different- we can achieve overloading
	public void addition(int a, int b) {
		int c = a+b;
		System.out.println("The third overloading addition method value is "+c);
	}
	
	//Number of parameter same as second overloading method , but type of parameter is different
	public void addition(String a) {
		//Convert the String value to int
		int b = Integer.parseInt(a);
		int c = 20;
		int d = b+c;
		System.out.println("The fourth overloading addition method value is "+d);
	}
	
	//Number of parameter same as third overloading method , but type of parameter is different
	public void addition(String a, String b) {
		//Convert the String value to int
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int e = c+d;
		System.out.println("The fifth overloading addition method value is "+e);
	}
	
	//Number of parameter same as third and fifth overloading method , but type of parameter is different
	public void addition(String a, int b) {
		//Convert the String value to int
		int c = Integer.parseInt(a);
		int d = c+b;
		System.out.println("The sixth overloading addition method value is "+d);
	}
	
	//Number of parameter same as sixth, third and fifth overloading method.
	//Parameter type is string and int as i sixth overloading method
	//We will achieve overloading by changing the sequence of the type
	public void addition(int a, String b) {
		//Convert the String value to int
		int c = Integer.parseInt(b);
		int d = a+c;
		System.out.println("The seventh overloading addition method value is "+d);
	}
	
	public void addition(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("The eigth overloading addition method value is "+d);
	}

}


