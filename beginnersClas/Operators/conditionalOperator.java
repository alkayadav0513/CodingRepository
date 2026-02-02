package Operators;

public class conditionalOperator {

	public static void main(String[] args) {

		//OR logic  - Any one input is true, final result is true
		/*SHORT _CIRCUITING IN OR:
		 * If the first value is TRUE, compiler will not check the second value.*/
		/*	0 = false
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
		

		//AND logic  - ALL input are true, final result is true
		/*SHORT _CIRCUITING IN AND:
		 * If the first value is FALSE, compiler will not check the second value.*/
		/*  0 = false
		 *  1 = true
		 *   input a		input b		Output
		 *   -------        --------     ------
		 *   0				0				0
		 *   1				0				0
		 *   0				1				0
		 *   1				1				1
		 * 
		 * 
		 */
		
		//NOT>AND>OR
		//Highest hierarchy will be compiled first
		//AND - &&
		//OR  - ||
		//NOT - !
		//Conditional operator throws boolean value
		
		
		int a = 10;
		double b = 90.05D;
		float c = 77.12F;
		short d = 20;
		byte e = 126;
		
		/*In AND logic, if the first operand is FALSE, we can ignore the second operand,
		as the result will be FALSE - SHORT CIRCUIT*/
		
		/*In OR logic, if the first operand is TRUE, we can ignore the second operand,
		as the result will be TRUE - SHORT CIRCUIT*/
		
		
		System.out.println(a>b && c>a );//false && true = false
		
		System.out.println(a>b && c>a || d>a ); //true
		//a>b && c>a ==> false && true ==> false
		//a>b && c>a || d>a  ==> false || d>a  => false || true = true
		
		//System.out.println(b>a && c<=e || d==a && !d==b); 
		System.out.println(b>a && c<=e || d==a && !(d==b)); //true
		//!(d==b)==> !false = true
		//b>a && c<=e || d==a && !(d==b) ==> b>a && c<=e || d==a && true
		//b>a && c<=e ==> true &&  true = true       &        d==a && true ==> false && true = false
		//b>a && c<=e || d==a && true ==> true ||false = true

	}

}

