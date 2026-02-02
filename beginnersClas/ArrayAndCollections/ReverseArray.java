package ArrayAndCollections;
import java.util.*;
public class ReverseArray {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	System.out.println("The original array before reverse:");	
	for(int num:arr)
	{
		System.out.print(num+",");
	}
	
	int arrrev[]= new int[arr.length];
	int n=0;
	for(int j=arr.length-1;j>=0;j--)
	{
		arrrev[n]=arr[j];
		n++;
	}
	System.out.println("The array after reversal:");
	for(int num1:arrrev)
	{
		System.out.print(num1+",");
	}
	}
	
		
	
}
