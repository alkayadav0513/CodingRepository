package Operators;

public class arithmaticOperator {

	public static void main(String[] args) {

		
		// double>float>long>int>short>byte
		
		// +,- have same hierarchy
		// *, /, % have same hierarchy
		// *, /, %  has greater hierarchy than + and -
		// Higher the hierarchy, compilation is done first
		// Same hierarchy level - compilation left to right
		
		int a = 10;
		int b = 20;
		int c = 30;
		long d = 40L;
		byte e = 5;
		double f = 4.0D;
		
		double a1 = a+c-d*e/f;
		//d*e/f ==> 40*5/4.0 ==>200/4.0 = 50.0
		//a+c-d*e/f ==> a+c-5.0=> 10+30-50.0 = >40-50.0 = -10.0
		System.out.println(a1);
		
		System.out.println("******************");
		
		// double>float>long>int>short>byte
		long g = a+c-d/e;  //int,long,byte
		// d/e = 40/5 = 8
		// a+c-d/e -> a+c-8 -> 10+30-8 -> 40-8 -> 32
		System.out.println(g);//32
		
		System.out.println("***********************");
		// double>float>long>int>short>byte
		double h = f+d*c; //double, long, int
		//d*c = 40* 30 = 1200L
		//f+d*c = 4.0+1200L = 1204.0D
		System.out.println(h); //1204.0
		
		System.out.println("***********************");
		// double>float>long>int>short>byte
		double i = f*e%2+4/3; //double, byte
		// f*e%2 => 4.0*5%2 ==> 20.0%2 => 0.0      &      4/3 => 1
		//f*e%2+4/3 ==> 0.0 + 1 = 1.0
		System.out.println(i); //1.0
		
		System.out.println("***********************");
		System.out.println((4*2/2%3)+(4+6/2)); //8
		//If there is a parenthesis in expression it will be dealt first
		//(4*2/2%3)=> 8/2%3 ==>4%3 = 1     &     (4+6/2) => 6/2 = 3 => (4+3) = 7
		// ((4*2/2%3)+(4+6/2)) => ((1)+(7)) = 8
		
		
	}

}
