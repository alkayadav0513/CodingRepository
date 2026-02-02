package BinarySearch;

public class OrderAgonisticBS{
	public static void main(String args[])
	{
		//int arr []= {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
		int arr[]= {99,80,75,22,11,10,5,2,-3};
		int target=80;
		int result=AgonisticSearch(arr,target);
		System.out.println(result);
	}
	static int AgonisticSearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		//find the array whether the array is sorted in ascending or descending order.
		boolean isAsc;
		if(arr[start]<arr[end])
		{
			isAsc= true;
		
		}
		else
		{
			isAsc=false;
		}
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target)
			{
				return mid;
			}
			if(isAsc)
			{
				if(target<arr[mid])
				{
					end=mid-1;
				}
				else if(target>arr[mid])
				{
					start=mid+1;
				}
			}
			else
			{
				if(target>arr[mid])
				{
					end=mid-1;
				}
				else if(target<arr[mid])
				{
					start=mid+1;
				}
			}
			
			
		}
		return -1;
	}
}