package controlFlowStatement;

public class whileLoop {

	public static void main(String[] args) {

		//Program 1  - To print from 10 to 1
		//Initial Statement
		int a = 10;
		while(a>=1) {  //Conditional Statement  ->10>=1, 9>=1, 8>=1, 7>=1, 6>=1, 5>=1, 4>=1, 3>=1, 2>=1, 1>=1, 0>=1
			System.out.println(a); //10, 9, 8, 7, 6, 5, 4, 3, 2, 1
			a--; // Decrement Statement -> 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
		}
		System.out.println("Final value of a is "+a);//0
		
		System.out.println("******************");
		//Program 1  - To print from 10 to 1 with a different condition
		int b = 10;
		while(b>0) {  //Conditional Statement  ->10>0, 9>0, 8>0, 7>0, 6>0, 5>0, 4>0, 3>0, 2>0, 1>0, 0>0 
			System.out.println(b);  //10, 9, 8, 7, 6, 5, 4, 3, 2, 1
			b--; // Decrement Statement - 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
		}
		
		System.out.println("Final value of b is "+a);//0
		
		
		System.out.println("********Infinite Loop***********");
		//Program 1  - To print from 10 to 1 with infinite looping
		//int c = 10;
		/*
		 * while(c>0) { System.out.println(c); //10,11,12,13,14....... c++; //Bad
		 * increment statement }
		 */
		
		System.out.println("********Infinite Loop***********");
		//Program 1  - To print from 10 to 1 with infinite looping
		/*
		 * int d = 10; while(d>0) { System.out.println(d); //10,10,10...... //Forgot to
		 * give decrement statement - infinite loop }
		 */
		
		System.out.println("********Infinite Loop***********");
		//Program 1  - To print from 10 to 1 with infinite looping
		/*
		 * int d1 = 10; while(d1<11) { //Bad Condition System.out.println(d1); //10 , 9,
		 * 8, 7, 6........... d1--; //9, 8, 7, 6, 5........ }
		 */
		
		System.out.println("******************");
		//Program 2  - Summation of 100 numbers starting with 1
		//1+2+3+4+5+...+100 = ?
		int e = 1;
		int sum = 0;
		while(e<=100) {
			System.out.println("Value of e for every loop is "+e); //1, 2, 3, 4, 5.....100
			sum = sum+e; //sum = 0+1 = 1  , sum = 1+2 = 3, sum = 3+3 = 6, sum = 6+4 = 10, sum = 10+5 = 15...Sum = Sum+100
			System.out.println("Summation value for every loop is "+sum);//1, 3, 6, 10, 15.......
			e++;//2, 3, 4, 5........100,101
		}
		System.out.println("Final value of summation of first hundred numbers is "+sum);
		System.out.println("Final value of e at which while loop terminates is "+e);//101
			
		System.out.println("******************");
		//Program 3  - Multiplication of 5 numbers starting with 10
		//10*11*12*13*14 = ?
		int f = 10;
		int mul = 1;
		while(f<15){
			//System.out.println("Value of f for every loop is "+f); //10, 11, 12, 13, 14
			mul = mul*f; //1*10 = 10, 10*11 = 110, 110*12 = 1320, 1320*13, 1320*13*14
			//System.out.println("Multiplication value for every loop is "+mul);//10, 110, 1320, 1320*13, 1320*13*14
			f++;//11, 12, 13, 14, 15
		}
		System.out.println("Final value of multiplication of five numbers starting with 10 is "+mul);
		System.out.println("Final value of f at which while loop terminates is "+f);//15
	
	
		System.out.println("********Break**********");
		//To print from 10 to 20 but break the loop when value is 15
		int g = 10;
		while(g<=20) {
			System.out.println(g); //10, 11, 12, 13, 14, 15
			if(g==15) {
				break;
			}
			g++; //11, 12, 13, 14, 15
		}
		
		System.out.println("********continue**********");
		//To print from 10 to 20
		int h = 10;
		while(h<=20) {
			System.out.println(h); //10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
			h++; //11, 12, 13, 14, 15,16, 17, 18, 19, 20, 21
			System.out.println("Before if block having continue");
			if(h==15) {
				continue;
			}
			System.out.println("After if block having continue");
		}
		//10
		//Before if block having continue
		//After if block having continue
		//11
		//Before if block having continue
		//After if block having continue
		//12
		//Before if block having continue
		//After if block having continue
		//13
		//Before if block having continue
		//After if block having continue
		
		//14
		//Before if block having continue
		
		//15
		//Before if block having continue
		//After if block having continue
		
		//16
		//Before if block having continue
		//After if block having continue
		
		//17
		//Before if block having continue
		//After if block having continue
		
		//18
		//Before if block having continue
		//After if block having continue
		
		//19
		//Before if block having continue
		//After if block having continue
		
		//20
		//Before if block having continue
		//After if block having continue
	
		System.out.println("********break**********");
		//Multiples of 2 and 5 for numbers from 1 until 100.
		int i = 1;
		while(true) {
			if(i%2 ==0 && i%5==0) {
				System.out.println(i+ " is a multiple of 2 and 5");
			}
			i++;//2, 3.......99, 100, 101
			if(i==101) {
				break;
			}
		}
		
		System.out.println("***************");
		int i1 = 1;
		while(i1<=100) {
			if(i1%2 ==0 && i1%5==0) {
				System.out.println(i1+ " is a multiple of 2 and 5");
			}
			i1++;
			
		}
	
	
	
	
	
	}

}