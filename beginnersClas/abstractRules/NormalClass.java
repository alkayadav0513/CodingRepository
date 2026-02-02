package abstractRules;

/*When a normal class extends an abstract class, we need to override 
all the abstract methods in the normal class,present in abstract class.*/
public class NormalClass extends Example{
	
	public static int aa;
	private static int bb;
	protected static int cc;
	static int dd;
	
	public int ee;
	private  int ff;
	protected  int gg;
	int hh;

	public static void main(String[] args) {
		NormalClass n1 = new NormalClass();
		
		//Static Variable of the Abstract class
		NormalClass.a = 10; //Public 
		//NormalClass.b = 20; // Private
		NormalClass.c = 30; //Protected
		NormalClass.d = 40; //Default
		System.out.println(NormalClass.a+"--"+NormalClass.c+"--"+NormalClass.d);
		
		//Instance variable of the Abstract class
		n1.e = 100; //public 
		//n1.f = 200; //Private
		n1.g = 300; //Protected
		n1.h = 400; //Default
		System.out.println(n1.e+"--"+n1.g+"--"+n1.h);
		
		//Static variable of the Normal class
		NormalClass.aa = 1000; //public
		NormalClass.bb = 2000; //private
		NormalClass.cc = 3000; //protected
		NormalClass.dd = 4000; //default
		System.out.println(NormalClass.aa+"--"+NormalClass.bb+"--"+NormalClass.cc+"--"+NormalClass.dd);
		
		//Instance variable of the Normal class
		n1.ee = 10000; //public 
		n1.ff = 20000; //Private
		n1.gg = 30000; //Protected
		n1.hh = 40000; //Default
		System.out.println(n1.ee+"--"+n1.ff+"--"+n1.gg+"--"+n1.hh);
		
		//Static method of the Abstract class
		NormalClass.NormalMethod1(); //public - throw body as defined in Abstract class
		//NormalClass.NormalMethod2(); //private
		NormalClass.NormalMethod3(); //protected - throw body as defined in Abstract class
		NormalClass.NormalMethod4(); //default - throw body as defined in Abstract class
		
		//Non-Static method of the Abstract class
		n1.NormalMethod5(); //public -throw body as defined in Abstract class.
		//n1.NormalMethod6(); //private
		n1.NormalMethod7(); //Protected - throw the overridden body
		n1.NormalMethod8(); //Default - throw body as defined in Abstract class.
		
		//Static method of the Normal class
		NormalClass.NormalMethod9(); //public - throw body as defined in Normal class
		NormalClass.NormalMethod10(); //private - throw body as defined in Normal class
		NormalClass.NormalMethod11(); //protected - throw body as defined in Normal class
		NormalClass.NormalMethod12(); //default - throw body as defined in Normal class
	
		//Non-Static method of the Normal class
		n1.NormalMethod13();//public - throw body as defined in Normal class
		n1.NormalMethod14();//private - throw body as defined in Normal class
		n1.NormalMethod15();//protected - throw body as defined in Normal class
		n1.NormalMethod16();//default - throw body as defined in Normal class
		
		//Overridden Abstract Methods
		n1.AbstractMethod1(); //public - throw the overridden body
		int a = n1.AbstractMethod3(); //Protected 
		System.out.println("The result of protected abstract method overridden in normal class is "+a);
		n1.AbstractMethod4(); //default - throw the overridden body
	}

	@Override
	public void AbstractMethod1() {
		System.out.println("Public abstarct method 1 overridden in NormalClass class");
		
	}

	//public>protected>default>private
	@Override
	protected int AbstractMethod3() {
		
		return 10;
	}

	//public>protected>default>private
	@Override
	void AbstractMethod4() {
		System.out.println("Default abstarct method 4 overridden in NormalClass class");
		
	}
	
	//Normal Methods/ Concrete Method - Static methods
	public static void NormalMethod9() {
		System.out.println("This is a public static normal method with name as NormalMethod9 in normal class");
	}
			
	private static void NormalMethod10() {
		System.out.println("This is a private static normal method with name as NormalMethod10 in normal class");
	}
			
	protected static void NormalMethod11() {
		System.out.println("This is a proctected static normal method with name as NormalMethod11 in normal class");
	}
			
	static void NormalMethod12() {
		System.out.println("This is a default static normal method with name as NormalMethod12 in normal class");
	}
			
	//Normal Methods/ Concrete Method - Non-Static methods
	public void NormalMethod13() {
		System.out.println("This is a public non-static normal method with name as NormalMethod13 in normal class");
	}
			
	private void NormalMethod14() {
		System.out.println("This is a private non-static normal method with name as NormalMethod14 in normal class");
	}
			
	protected void NormalMethod15() {
		System.out.println("This is a protected non-static normal method with name as NormalMethod15 in normal class");
	}
			
	void NormalMethod16() {
		System.out.println("This is a default non-static normal method with name as NormalMethod16 in normal class");
	}
	
	//Overridden the method in the child class
	protected void NormalMethod7() {
		System.out.println("This is a protected non-static normal method with name as NormalMethod7 which is overridden in normal class ");
	}

}