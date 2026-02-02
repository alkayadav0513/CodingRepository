package aboutInterface;

//Test class is implementing IMutipleInheritance interface
//IMutipleInheritance is inheriting IMobile and IExample interface - Multiple Inheritance
/*IMobile and IExample interface has abstract method. These abstract methods needs
to be overridden in Test class*/
//IMutipleInheritance interface abstract method also needs to be overridden in Test Class
public class Test implements IMultipleInheritance, IDesktop{

	public static void main(String[] args) {
		
		Test t1 = new Test();

		/*When Static and final variable are calle in class implementing interface,
		they are called by interface name or class name.*/
		//Static and final variables of the IExample interface
				
		System.out.println(IExample.a);
		System.out.println(IExample.b);
		System.out.println(IExample.c);
		System.out.println(IExample.d);
		System.out.println(IExample.e);
		System.out.println(IExample.f);
		System.out.println(Test.a);
		System.out.println(Test.b);
		System.out.println(Test.c);
		System.out.println(Test.d);
		System.out.println(Test.e);
		System.out.println(Test.f);
		
		//Static and final variables of the IMobile interface
		System.out.println(Test.ringTone);
		System.out.println(IMobile.ringTone);
		
		//Static and final variables of the IMutipleInheritance interface
		System.out.println(Test.a1);
		System.out.println(IMultipleInheritance.a1);
		
		//Static method of the IExample interface
		/*Static method of the interface are called by the interface name in the class.
		implementing the interface.*/
		IExample.NormalMethodA();//public - throw body as defined in IExample interface
		//IExampleAgain.NormalMethodB();//private - so cannot be used 
		IExample.NormalMethodC();//default - throw body as defined in IExample interface

		//Default method of IExample interface
		t1.defaultMethodE(); //throw body as defined in IExample Interface
		int a = t1.defaultMethodF(10, 21);
		System.out.println(a); //throw body as defined in IExample Interface
		t1.defaultMethodG(); //throw body as defined in IExample Interface
		
		//Default method of IMobile interface
		t1.volume();//throw body as overridden in Test class
		
		//Abstract method of IExample which are overridden in Test class
		t1.AbstractMethodH();
		int b = t1.AbstractMethodI(11, 21);
		System.out.println(b);
		t1.AbstractMethodJ();
				
		//Abstract method of IMobile which are overridden in Test class
		t1.homeScreen();
				
		//Abstract method of IMutipleInheritance which are overridden in Test class
		t1.addition();
	}

	//Overridden from IExample interface
	@Override
	public void AbstractMethodH() {
		System.out.println("AbstractMethodH method overridden in Test class");
		
	}

	//Overridden from IExample interface
	@Override
	public int AbstractMethodI(int a, int b) {
		return a+b;
	}
	//Overridden from IExample interface - Default abstract method becomes public in class implementing it.
	@Override
	public void AbstractMethodJ() {
		System.out.println("AbstractMethodJ method overridden in Test class");
		
	}

	//Overridden from IMobile interface
	@Override
	public void homeScreen() {
		System.out.println("homeScreen method overridden in Test class");
		
	}

	//Overridden from IMultipleInheritance interface
	@Override
	public void addition() {
		System.out.println("addition method overridden in Test class");
		
	}
	//Default method of IMobile interface overridden in the Test class
	//When Overridden, default method of interface needs to be public
	public void volume() {
		System.out.println("The volume is set to max level - overridden in test class");
	}

}

