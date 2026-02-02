package ThreeDaysChallenge;
import java.util.*;
public class Movezeroend {
	public static void main(String args[])
	{
		int arr[]= {12,5,7,0,0,11,0,34};
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		
		while(count<arr.length)
		{
			arr[count++]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	

}
