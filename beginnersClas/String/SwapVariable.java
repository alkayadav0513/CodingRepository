package String;
import java.util.*;
//Swap two numbers without using a third variable
//apple, banana
public class SwapVariable {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String input1=sc.nextLine().toLowerCase();
	String input2=sc.nextLine().toLowerCase();
	System.out.println("The entered input1 before swapping:"+input1+" input2:"+input2);
	input1=input1+input2;
	input2=input1.substring(0,input1.length()-input2.length());
	input1=input1.substring(input2.length());
	
	System.out.println("The entered input1 after swapping:"+input1+" input2:"+input2);
	}
}
