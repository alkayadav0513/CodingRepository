package ThreeDaysChallenge;

import java.util.Arrays;

public class NegativeandPostive {
	
	public static void main(String args[])
	{
		int arr[]= { -1, 3, -5, 6, -2, 4 };
		int result[]= new int[arr.length];
		int index=0;
		for(int num:arr)
		{
			if(num<0)
			{
				result[index++]=num;
			}
		}
		for(int num:arr)
		{
			if(num>=0)
			{
				result[index++]=num;
			}
		}
		
		System.out.println("The final result is:"+Arrays.toString(result));
	}

}
