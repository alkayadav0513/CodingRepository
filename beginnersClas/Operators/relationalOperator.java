package Operators;

public class relationalOperator {

	public static void main(String[] args) {
		//Relational operator is to compare numbers
		//<,<=,>,>=, == (Equality Operator), != (Not equal to operator)
		
		System.out.println(3==4); //false
		System.out.println(3==3); //true
		System.out.println(3>3); //false
		System.out.println(3>4); //false
		System.out.println(13>4); //true
		System.out.println(15<12); //false
		System.out.println(10<11); //true
		
		//OR logic  - Any one input is true, final result is true
		/*SHORT _CIRCUITING IN OR:
		 * If the first value is TRUE, compiler will not check the second value.*/
		
		/*  0 = false
		 *  1 = true
		 *   input a		input b		Output
		 *   -------        --------     ------
		 *   0				0				0
		 *   1				0				1
		 *   0				1				1
		 *   1				1				1
		 * 
		 * 
		 */
		System.out.println(15>=15); // 15>15 OR 15==15 ==>  false OR TRUE = true
	
		System.out.println(15<=15);// 15<15 OR 15==15  = false OR true = true
		
		System.out.println(14>=13); // 14>13 OR 14==13  = true  OR false = true
		
		System.out.println(11<=10); // 11<10 OR 11==10  = false  OR  false = false
		
		System.out.println(11 != 10); //true
		
		System.out.println(10 != 10); //false
		
		System.out.println("**************");
		
		int a = 89;
		double b  = 89.01;
		System.out.println(a>b); //false
		System.out.println(a<=b); //a<b OR a==b ==> true OR false ==> true
	
	
	}
}