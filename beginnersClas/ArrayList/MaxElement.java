package ArrayList;

public class MaxElement {
	public static void main(String args[])
	{
		int arr[]= {3,81,12,0,2};
		System.out.println(maxEle(arr));
		System.out.println(maxEleRange(arr,2,4));

}

	static int maxEle(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length==0)
		{
			return -1;
			
		}
		int maxValue=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>maxValue)
			{
				maxValue=arr[i];
			}
		}
		return maxValue;
	}
	
	static int maxEleRange(int[] arr,int start, int end) {
		
		// TODO Auto-generated method stub
		if(end<start || arr==null)
		{
			return -1;
		}
		int maxValue=arr[start];
		for(int i=start;i<=end;i++)
		{
			if(arr[i]>maxValue)
			{
				maxValue=arr[i];
			}
		}
		return maxValue;
	}
}
