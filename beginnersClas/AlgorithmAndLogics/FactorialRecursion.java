package AlgorithmAndLogics;
import java.util.*;
public class FactorialRecursion {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("The entered number is:"+num);
		int result=factorial(num);
		System.out.println("The factorial of "+ num+" is:"+result);
	}
	public static int factorial(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else
		{
			return num*factorial(num-1);
		}
	}

}
