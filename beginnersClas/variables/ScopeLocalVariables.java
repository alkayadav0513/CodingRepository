package variables;

public class ScopeLocalVariables {

	public static void main(String[] args) {


		System.out.println("****Local variable sare defined in method body****");
		//Scope (usage) of local variables is in the  method in which it is defined
		//Local variable in main method 
		int a = 20;
		System.out.println(a);//20
		
		//Call the scope1()
		ScopeLocalVariables.scope1();
		
		//Use the variable b defined in scope1() method in main method
		//System.out.println(b);
		
		//IF BLOCK
		if(true) {
			//Local variable d is used inside IF block
			//Its usage will be inside IF block only
			int d = 0;
			d = d+1;//1
			System.out.println(d +" is the value of variable d scoped in IF BLOCK");
		}
		
		//Can I use the local variable "d" of the IF block in main method body? NO
		//System.out.println(d +" is the value of variable d scoped in IF BLOCK");
		
		//WHILE BLOCK
		while(true) {
			//Local variable e is used inside WHILE block
			//Its usage will be inside WHILE block only
			int e = 1;
			e = e+1; //e = 1+1 = 2
			System.out.println(e +" is the value of variable e scoped in WHILE BLOCK");
			//IF the value of local variable e is 2 , break out(terminate) of the loop
			if(e==2) {
				break;
			}
		}
		
		//Can I use the local variable "e" of the WHILE block in main method body? NO
		//System.out.println(e +" is the value of variable e scoped in WHILE BLOCK");

	}
	
	public static void scope1() {
		//Want to use local variable "a" described in main method here
		//System.out.println(a); //Syntax error - a cannot be resolved to a variable
		
		//We can have a variable "a" for this method  - scope1() method
		//Scope of a this local variable is within scope1() method
		int a = 100;
		System.out.println(a+" - value of local variable a in scope1 method");
		
		//Scope of a this local variable "b" is within scope1 method
		int b = 200;
		System.out.println(b+" - value of local variable b in scope1 method");
		
	}
}

