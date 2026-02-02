package AlgorithmAndLogics;
import static java.lang.System.out;

import java.util.*;
public class primeNumCheck {
	public static void main(String args[])
	{
		int start=1;
		int end=100;
		//Scanner sc= new Scanner(System.in);
		//int num=sc.nextInt();
		//System.out.println("The entered number is:"+num);
		
		for(int i=start;i<=end;i++)
		{
			boolean isPrime=true;
			if(i<=1)
			{
				continue;
			}
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println("The prime number between 1 and 100 are:"+i);
			}
		}
		
	}

}
