package LinearSearch;

public class MaxValue {
	public static void main(String args[])
	{
		int arr[][]= {
				{5,7 ,14 ,8},
				{4,1,55,98},
				{2,9,67,32},
				{16,13}
		};
		
		int ans=searchMaxValue(arr);
		System.out.println(ans);
	}
	static int searchMaxValue(int arr[][])
	{
		int max=Integer.MIN_VALUE;
		/*for(int a[]:arr)
		{
		  for(int elements:a)
			{
				if(elements>max)
				{
					max=elements;
				}
			}
		}
		return max;*/
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				if(arr[row][col]>max)
				{
					max=arr[row][col];
				}
			}
		}
		return max;
	}

}
