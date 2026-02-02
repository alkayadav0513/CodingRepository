package LinearSearch;

public class linearSearch3 {
	public static void main(String args[])
	{
		int arr[]= {6,8,4,-9,9,-17,03,-34,32,41};
		int target=44;
		Boolean result=linearSearch3method(arr,target);
		System.out.println(result);
	}
	
	static boolean linearSearch3method(int arr[],int target) {
		if(arr.length==0)
		{
			return false;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return true;
			}
		}
		return false;
	}

}


