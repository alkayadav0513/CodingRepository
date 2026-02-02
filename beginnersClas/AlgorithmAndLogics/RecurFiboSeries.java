package AlgorithmAndLogics;
import java.util.*;
public class RecurFiboSeries {
	public static void main(String args[])
	{
		int n=10;
		
		System.out.println("Fibonaci series are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(factorial(i)+",");
		}
	}
	
	public static int factorial(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return factorial(n-1)+factorial(n-2);//recursive call
		}
		
	}

}
