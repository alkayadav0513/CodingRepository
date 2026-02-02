package Day2;

import java.util.Arrays;

public class RemoveDuplicateElements {
	public static void main(String args[])
	{
		int arr[]= {5,6,8,9,2,6,8};
		int []result=Arrays.stream(arr).distinct().toArray();
		
		System.out.println("Array after removing duplicates:" + Arrays.toString(result));
	}

}
