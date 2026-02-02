package Method;

public class Mathematics {

	public static void main(String[] args) {

		//Creating Addition method in main method body - will show syntax error
		/*public static void addition() {
			
		}*/
		
		
		Mathematics m1 = new Mathematics();
		
		//We need to call the addition() method inside main method body;
		//This will allow compilation of addition() method body
		Mathematics.addition(); //300
		Mathematics.addition(); //300
		Mathematics.addition(); //300
		
		//Call the Subtraction Method
		//Pass the parameter value based on parameter type
		m1.subtraction(20, 200);//180
		m1.subtraction(25, 100);//75
		m1.subtraction(220, 1000);//780
		
		//Call the Multiplication Method
		// double d = 1*2*3 = 6.0
		double a = Mathematics.multiplication(1, 2, 3);
		System.out.println("The result of multiplication method is "+a); //6.0
		double b = Mathematics.multiplication(10, 20, 30);
		System.out.println("The result of multiplication method is "+b); //6000.0
		
		//Call the Division Method
		//20 is of double type.
		/*We can declare a double variable value with or without decimal part.
		 * It will be stored in the memory as a decimal value.*/
		double c = m1.division(20, 2); //20.0/2 - 10.0 (quotient part after division)
		System.out.println(c);
		
		double d = m1.division(30.0, 2); //30.0/2 = 15.0(quotient part after division)
		System.out.println(d);
		

	}
	
	//Methods without parameter
	//Drawback - When the method is called , it give the same result
	public static void addition() {
		//Local variable are described in method body
		//a,b,c are local variable of addition method.
		//The scope/usage of a local variable is inside method body
		//Duplication of local variable name is not allowed
		int a = 100;
		int b = 200;
		int c = a+b;
		System.out.println("The value of the addition method is "+c);
		
		//Duplication of local variable name is not allowed. 
		//It does not matter what data type(primitive  type) or type (object type) it is;
		//long a = 1000;
	}
	
	//Method with parameter - will give different value for different parameter values passed
	public void subtraction(int a, int b) {
		//The scope/usage of a parameter variable is like a local variable
		//Duplication of parameter variable name is not allowed. 
		//It does not matter what data type(primitive  type) or type (object type) it is;
		//Integer a = 200;
		
		int c = b-a;
		System.out.println("The value of the subtraction method is "+c);
		
	}
	
	//Methods with return type - can be with parameters or without parameters
	public static double multiplication(int a, int b, int c) {
		//Numbers can be of short, byte, int, long, double, float primitive type.
		//short, byte, int, long -> non-decimal numbers
		//double, float - decimal number
		/*
		 * Hierarchy:
		 * double>float>long>int>short>byte
		 * 
		 * When we do mathematical calculation between less hierarchy variable and 
		 * put the result of it into high hierarchy variable, the result would be of 
		 * high hierarchy.
		 * 
		 * int a1 = 10;
		 * int a2 = 20;
		 * double a3 = a1+a2
		 * 
		 * a3 , which is double variable (decimal number) will have decimal 
		 * value.
		 * 
		 */
		
		double d = a*b*c;
		return d;
		//After return statement, there should be any other code - will show unreachable code.
		//int a1 = 10;
		
	}
	
	public double division(double a, int b) {
		
		/*After division the resultant value will be of double value, as 
		 * double is greater in hierarchy as compared to int.
		 * 
		 * Hierarchy:
		 * double>float>long>int>short>byte
		 */
		
		return a/b;
	}

}


