package ArrayAndCollections;

public class LargestAndSmallestArray {
	public static void main(String args[])
	{
		int arr[]= {7,9,8,12,67,-1};
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println("The largest element in array is:"+max);
		System.out.println("The smallest element in array is:"+min);
	}

}
