package abstractRules;


//Test class becomes child of AbstractClass class
//Test class becomes grand child of Example class
//One of the abstract method AbstractMethod4(), not overridden in AbstractClass class
/*That AbstractMethod4() has to be overridden in Test class as the Test class
inherited the AbstractClass class which internally inherits the Example abstract class*/
public class Test extends AbstractClass{

	public static void main(String[] args) {
		Test t1 = new Test();
		
		//Static Variable of the Example class
		Test.a = 10; //Public 
		//Test.b = 20; // Private
		Test.c = 30; //Protected
		Test.d = 40; //Default
		System.out.println(Test.a+"--"+Test.c+"--"+Test.d);
		
		//Static variable of the AbstractClass class
		Test.str1  = "Hello";
		System.out.println(Test.str1);
		
		//Instance variable of the AbstractClass class
		t1.str2 = "Welcome";
		System.out.println(t1.str2);
		
		//Instance variable of the Example class
		t1.e = 100; //public 
		//t1.f = 200; //Private
		t1.g = 300; //Protected
		t1.h = 400; //Default
		System.out.println(t1.e+"--"+t1.g+"--"+t1.h);
		
		//Static method of the Example class
		Test.NormalMethod1(); //public - throw body as defined in Example class
		//Test.NormalMethod2(); //private
		Test.NormalMethod3(); //protected - throw body as defined in Example class
		Test.NormalMethod4(); //default - throw body as defined in Example class
		
		//Non-Static method of the Example class
		t1.NormalMethod5(); //public -throw body as defined in Example class.
		//t1.NormalMethod6(); //private
		t1.NormalMethod7(); //Protected - throw body as defined in Example class.
		t1.NormalMethod8(); //Default - throw body as defined in Example class.
		
		//Static method of the AbstractClass class
		Test.Addition(); //Public  - Throw the body as defines in AbstractClass class

		//Non-Static method of the AbstractClass class		
		t1.Subtraction();//Public  - Throw the body as defines in AbstractClass class
		
		//Overridden method as defined in  AbstractClass class	
		t1.AbstractMethod1(); //public - will throw overridden body as defined in  AbstractClass class	
		int a = t1.AbstractMethod3();//protected - will throw overridden body as defined in  AbstractClass class	
		System.out.println("Protected overridden body as defined in AbstractClass class is  "+a);
			
		//Overridden method as defined in  Test class	
		t1.AbstractMethod4(); //Default - will throw the overridden body as defined in Test class
	}

	@Override
	void AbstractMethod4() {
		System.out.println("Example abstract class's AbstractMethod4 was not overridden in AbstractClass class. "
				+ "So when a normal class called Test inherits AbstractClass class the remaining Abstract method in Example class needs to be inherited.");
		
		
	}

}

