package ArrayQuestions;

import java.util.Arrays;

// Rotate an array by kth position-Leet question
/*Approach 2: In-Place Rotation (Reversal Algorithm) → No Extra Space

Steps:

Reverse the whole array

Reverse first k elements

Reverse last n-k elements*/

public class RotateArray {
	public static void main(String args[])
	{
		int arr[]= {1, 2, 3, 4, 5, 6, 7};
		int k=3;
		rotateArrayResult(arr,k);
	}
	public static void rotateArrayResult(int[] arr, int k) {
		int n=arr.length;
		k=k%n;
		rotateArray(arr,0,n-1);
		rotateArray(arr,0,k-1);
		rotateArray(arr,k,n-1);
		
		System.out.println(Arrays.toString(arr));
		
	}
	public static void rotateArray(int arr[],int start, int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	

}
