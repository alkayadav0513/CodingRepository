package aboutInterface;

public interface IExample {
	
	//Data Members or Fields
	
	//The blank final field a may not have been initialized. 
	//public final static int a; 
	public final static int a = 10;
	//Even if static keyword is not used, it will be static
	public final int b  = 20; 
	//Even if final keyword is not used, it will be final
	public static int c  = 30; 
	//Even if final and static  keyword is not used, it will be final and static 
	public int d  = 40;
	//Default access modifier is allowed with no static keyword
	final static int e = 50;
	//Default access modifier  - Even if final and static  keyword is not used, it will be final and static 
	int f = 60;
	
	//protected access modifier not allowed for data members
	//Class cannot inherit an interface; it implements an interface; so protected access modifier is not allowed.
	//protected final static int g = 70;
	//private access modifier not allowed for data members
	//private final static int h = 80;
	
	public static void main(String[] args) {
		//IExample i1 = new IExample(); //Interfaces instantiation not possible
		
		
		//Static and final data members - calling with interface  name
		System.out.println(IExample.a);
		System.out.println(IExample.b);
		System.out.println(IExample.c);
		System.out.println(IExample.d);
		System.out.println(IExample.e);
		System.out.println(IExample.f);
				
		//Static normal methods - calling with Interface name
		IExample.NormalMethodA();//public - throw body as defined in IExample interface
		IExample.NormalMethodB();//private - throw body as defined in IExample interface
		IExample.NormalMethodC();//default - throw body as defined in IExample interface
		
	}
	
	//Static method in the interface
	public static void NormalMethodA() {
		System.out.println("Public static normal method  - NormalMethodA of the IExample interface");
	}
		
	private static void NormalMethodB() {
		System.out.println("Private static normal method  - NormalMethodB of the IExample interface");
	}
		
	static void NormalMethodC() {
		System.out.println("Default static normal method  - NormalMethodC of the IExample interface");
	}
		
	//protected static method should not be used
	/*protected static void NormalMethodD() {
		System.out.println("Protected static normal method  - NormalMethodD of the IExample interface");
	}*/
	
	//Default method in the interface
	default void defaultMethodE() {
		System.out.println("Default method  - defaultMethodE in the IExample interface");
	}
		
	default int defaultMethodF(int a, int b) {
		System.out.println("Default method  - defaultMethodF in the IExample interface");
		int c = a+b;
		return c;
	}
		
	default void defaultMethodG() {
		System.out.println("Default method  - defaultMethodG in the IExample interface");
	}
	
	//Abstract Methods
	public abstract void AbstractMethodH();
	public int AbstractMethodI(int a, int b);
	abstract void AbstractMethodJ();
	//private abstract void AbstractMethodK();
	//protected abstract void AbstractMethodL();

}