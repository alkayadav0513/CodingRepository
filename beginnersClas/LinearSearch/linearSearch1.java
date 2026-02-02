package LinearSearch;

public class linearSearch1 {
	public static void main(String args[]){
		 int arr[]={6,8,18,9,-11,03,-34};
	       int target=17;
	       int ans=linearSearch1method(arr,target);
	       System.out.println(ans);
		
	}
	
	static int linearSearch1method(int arr[],int target) {
		
		if(arr.length==0)
		{
			return Integer.MAX_VALUE;
		}
		for(int nums:arr)
		{
			if(nums==target)
			{
				return nums;
			}
		}
		return Integer.MAX_VALUE;
	}

}
