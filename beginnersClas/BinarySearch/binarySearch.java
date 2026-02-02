package BinarySearch;

public class binarySearch {
	public static void main(String args[])
	{
		int arr []= {-18,-16,-12,0,5,8,11,19,25,36,49};
		int target=0;
		int result=searchTargetElement(arr,target);
		System.out.println(result);
	}
	
	static int searchTargetElement(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
	        if(target<arr[mid])
	        {
	        	end=mid-1;
	        }
	        else if(target>arr[mid])
	        {
	        	start=mid+1;
	        }
	        else
	        {
	        	return mid;
	        }
		}
		return -1;
	}
	

}

