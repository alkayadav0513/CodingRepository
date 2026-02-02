package Operators;

public class compoundOperator {

	public static void main(String[] args) {


		int a = 3;
		
		a += 3; //a = a+3
		System.out.println(a); //6
		a+=6; //a = a+6
		System.out.println(a);//12
		
		a-=2; //a = a-2
		System.out.println(a); //10
		a-=1; //a = a-1
		System.out.println(a); //9
		
		a*=3; //a = a*3
		System.out.println(a);//27
		a*=2; //a=a*2
		System.out.println(a); //54
		
		a/=2; //a = a/2
		System.out.println(a);//27
		a/=3; //a = a/3
		System.out.println(a);//9
		
		a%=2; //a = a%2
		System.out.println(a);//1
		a%=3; //a = a%3
		System.out.println(a);//1
		
		System.out.println("**************Left Shift Operator***************");
		//<<=  -left shift operator
		//a<<=b = a*2^b
		a<<=2; //a = 1*2^2==> 1*4 = 4
		System.out.println(a);//4
		
		a<<=5; //a = a*2^5 ==>a*2*2*2*2*2 ==>a*32 = 4*32 = 128
		System.out.println(a);//128
		
		System.out.println(20<<2); //20*2^2 ==> 20*4  = 80
		System.out.println(a<<=3); //128*2^3 ==> 128*8 = 1024
		System.out.println(30<<4); //30*2^4 ==> 30*16 = 480
		System.out.println(30<<3); //30*2^3 ==> 30*8 = 240
		
		System.out.println("**************Right Shift Operator***************");
		//>>=  -right shift operator
		//a>>=b = a/2^b
		a>>=2; //==> a = a>>=2; ==> a = a/2^2 ==> a = a/4 ==> 128/4 = 256
		System.out.println(a);//256
		a>>=3; //==> a = a>>=3; ==> a = a/2^3 ==> a = a/8 ==> 256/8 = 32
		System.out.println(a);//32
		
		System.out.println(20>>2); //20/2^2 ==> 20/4  = 5
		System.out.println(30>>4); //30/2^4 ==> 30/16 = 1
		System.out.println(10>>6); //10/2^6 ==> 10/64 = 0
		

	}

}
