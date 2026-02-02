package AlgorithmAndLogics;
public class BinarySearch {
    public static void main(String args[])
    {
    	int arr[]= {6,12,7,2,9,0};
    	int target=7;
    	
    	int result=BinarySearch(arr,target);
    	if(result==-1)
    	{
    		System.out.println("The target element is not found");
    		
    	}
    	else
    	{
    		System.out.println("The target element is found at index:"+result);
    	}
    }
    	
    	public static int BinarySearch(int arr[],int target)
    	{
    		int left=0;
    		int right=arr.length-1;
    		
    		while(left<=right)
    		{
    			int mid=left+(right-left)/2;
    			
    			if(arr[mid]==target) {
    				return mid;
    			}
    			
    			else if(arr[mid]>target)
    			{
    				left=mid+1; // search right half
    			}
    			else
    			{
    				right=mid-1; // search left half
    			}
    		}
    	
    	return -1;// not found
    }
    
}


