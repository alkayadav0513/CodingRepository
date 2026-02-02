package LinearSearch;

import java.util.Arrays;

public class linearSearch2DArray {
	public static void main(String args[])
	{
		
		int arr[][]= {
				{5,7 ,14 ,8},
				{4,1,55,98},
				{2,9,67,32},
				{16,13}
		};
		int target=5;
		
		int ans[]=searchTarget(arr,target);
		System.out.println(Arrays.toString(ans));
	}
		static int[] searchTarget(int arr1[][],int target1)
		{
			for(int row=0;row<arr1.length;row++)
			{
				for(int col=0;col<arr1[row].length;col++)
				{
					if(arr1[row][col]==target1)
					{
						return new int[]{row,col};
					}
				}
			}
			return new int[]{-1,-1};
		}
	
	
}



