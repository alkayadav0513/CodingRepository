package abstractRules;



public abstract class Example {
	
	public static int a;
	private static int b;
	protected static int c;
	static int d;
	
	public int e;
	private  int f;
	protected  int g;
	int h;

	public static void main(String[] args) {


		//We cannot create objects of Abstract class
		//Example e1 = new Example();
		//Static variables
		Example.a = 10;
		Example.b = 20;
		Example.c = 30;
		Example.d = 40;
		System.out.println(Example.a+"--"+Example.b+"--"+Example.c+"--"+Example.d);

		//Calling the normal static  methods
		Example.NormalMethod1();
		Example.NormalMethod2();
		Example.NormalMethod3();
		Example.NormalMethod4();
	}
	
	//Abstract class may not have abstract methods
	//Abstract Class may have normal Static methods
	public static void NormalMethod1() {
		System.out.println("This is a public static normal method with name as NormalMethod1 in abstract class.");
	}
	
	private static void NormalMethod2() {
		System.out.println("This is a private static normal method with name as NormalMethod2 in abstract class.");
	}
	
	protected static void NormalMethod3() {
		System.out.println("This is a protected static normal method with name as NormalMethod3 in abstract class.");
	}
	
	static void NormalMethod4() {
		System.out.println("This is a default static normal method with name as NormalMethod4 in abstract class.");
	}
	
	//Abstract Class may have normal non-Static methods
	public void NormalMethod5() {
		System.out.println("This is a public non-static normal method with name as NormalMethod5 in abstract class.");
	}
	
	private void NormalMethod6() {
		System.out.println("This is a private non-static normal method with name as NormalMethod6 in abstract class.");
	}
	
	protected void NormalMethod7() {
		System.out.println("This is a protected non-static normal method with name as NormalMethod7 in abstract class.");
	}
	
	void NormalMethod8() {
		System.out.println("This is a default non-static normal method with name as NormalMethod8 in abstract class.");
	}
	
	//Abstract class may also have abstract methods
	//Abstract method should be part of abstract class
	//Access modifiers are public , protected and default. Private
	//Abstract method uses the ABSTRACT keyword.
	//Abstract methods are non-static methods
	//Abstract methods has no body and it can have any return type.
	
	//public static abstract void AbstractMethod1(); //Static abstract methods not allowed
	//public void AbstractMethod1(); //Abstract keyword is not used.
	public abstract void AbstractMethod1();
	//private abstract void AbstractMethod2(); //Private abstract methods not allowed.
	protected abstract int AbstractMethod3();
	abstract void AbstractMethod4();
	
	
	

}
