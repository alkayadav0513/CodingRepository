package variables;

public class ScopeDataMember {
	
	//Scoping(usage) of data member depends on access modifier.
	//For a data member, scope(usage) is across the class
	public static int a;
	public int b;
	
	//Static variable value , once assigned, remains constant in the class, unless changed.
	//Instance variable value is different for different objects

	public static void main(String[] args) {
		
		
		ScopeDataMember s1 = new ScopeDataMember();
		
		//Static Variable
		ScopeDataMember.a = 1010;
		System.out.println(ScopeDataMember.a); //1010
		
		/* Here s1 reference variable is replaced by the class name in the compiler when \
		used with static variable.*/
		System.out.println(s1.a);//1010 
		/*Since class name is not used with static variable, here class name is appended 
		with the static variable by the compiler.*/
		System.out.println(a);//1010
		
		//Instance Variable
		s1.b = 200;
		System.out.println("Instance Variable value in main method is "+s1.b);//200
		
		System.out.println("*******Call the Scope1() method******");
		//Call the Scope1() method
		ScopeDataMember.Scope1();
		
		System.out.println("*******Call the Scope2() method******");
		//Call the Scope2() method
		ScopeDataMember.Scope2();
		
		System.out.println("*******Call the Scope3() method******");
		//Call the Scope3() method
		ScopeDataMember.Scope3();
				
		

	}
	
	public static void Scope1() {
		
		ScopeDataMember s1 = new ScopeDataMember();
		
		/*Static Variable  -Since the static variable value is assigned 1010 in main method
		it will give 100 here*/
		System.out.println(ScopeDataMember.a);// 1010
		
		//Re-assign the value of static variable in Scope1() method
		ScopeDataMember.a = 2000;
		System.out.println("Re-assigned value for static variable in Scope1 method is "+ScopeDataMember.a);
		
		
		//Instance Variable
		//Instance variable value is declared as 200 in main method.
		//Instance variable value is different for different objects
		//Here the value of instance variable will be the default value - 0
		System.out.println("Instance Variable value in scope1 method is "+s1.b); //0
		//Assign the value to instance variable
		s1.b = 3000;
		System.out.println("Instance Variable value in scope1 method is "+s1.b); //300
		
	
	}
	
	public static void Scope2() {
		ScopeDataMember s1 = new ScopeDataMember();
		
		//Static Variable
		//Static variable value was re-assigned to 2000 in scope1() method
		System.out.println(ScopeDataMember.a);// 2000
		
		//Instance Variable
		//Will give the default value - 0
		System.out.println("Instance Variable value in scope2 method is "+s1.b); //Default value - 0		
		s1.b = 4000;
		System.out.println("Instance Variable value in scope1 method is "+s1.b); //4000		
		
		
	}
	
	public static void Scope3() {
		ScopeDataMember s1 = new ScopeDataMember();
		System.out.println(ScopeDataMember.a);// 2000
		System.out.println(s1.b); //0
		
		s1.b = 10;
		System.out.println(s1.b);
		
	}

}

