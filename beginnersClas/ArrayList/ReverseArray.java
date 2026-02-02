package ArrayList;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String args[])
	{
		int arr[]= {5,8,2,7,23};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		int s=0;
		int e=arr.length-1;
		
		while(s<e)
		{
			swap(arr,s,e);
			s++;
			e--;
		}
	}
	public static void swap(int arr[],int start,int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
	}

}
