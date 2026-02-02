package abstractRules;

/*When a abstract class extends another abstract class, we can choose which abstract
* method of Example class that we wish to override in AbstractClass class*/

public abstract class AbstractClass extends Example{
	
	public static String str1;
	public String str2;

	public static void main(String[] args) {
		//Static Variable of the Example class
		AbstractClass.a = 10; //Public 
		//AbstractClass.b = 20; // Private
		AbstractClass.c = 30; //Protected
		AbstractClass.d = 40; //Default
		System.out.println(AbstractClass.a+"--"+AbstractClass.c+"--"+AbstractClass.d);
		
		//Static variable of the AbstractClass class
		AbstractClass.str1  = "Hello";
		System.out.println(AbstractClass.str1);
		
		//Static method of the AbstractClass class
		AbstractClass.Addition(); //Public  - Throw the body as define in AbstractClass class
	
		//Static method of the Example class
		AbstractClass.NormalMethod1(); //public - throw body as defined in Example class
		//AbstractClass.NormalMethod2(); //private
		AbstractClass.NormalMethod3(); //protected - throw body as defined in Example class
		AbstractClass.NormalMethod4(); //default - throw body as defined in Example class
	
	}
	
	@Override
	public void AbstractMethod1() {
		System.out.println("AbstractMethod1 of Example class oveeridden in AbstractClass class.");
	}
	
	@Override
	protected int AbstractMethod3() {
		return 100;
	}
	
	public static void Addition() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("The value of public static addition method in AbstractClass class is "+c);
	}
	
	public void Subtraction() {
		int a = 10;
		int b = 20;
		int c = b-a;
		System.out.println("The value of public non-static subtraction method in AbstractClass class is "+c);
	}
	

}

