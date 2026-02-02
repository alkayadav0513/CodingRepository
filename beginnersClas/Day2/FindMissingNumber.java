package Day2;

public class FindMissingNumber {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,5,6,7};
		int n =7;
		int actualsum=0;
		int expectedResult=n*(n+1)/2;
		
		for(int i=0;i<arr.length;i++)
		{
			actualsum=actualsum+arr[i];
		}
		
		int result=expectedResult-actualsum;
		System.out.println("The missing number is :"+result);
	}

}
