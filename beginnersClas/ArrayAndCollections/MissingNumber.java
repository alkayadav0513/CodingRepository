package ArrayAndCollections;
//Find missing number in 1..N sequence
public class MissingNumber {
	public static void main(String args[])
	{
		int arr[]= {0,1,3,4,5,6,7};
		
		int totalSum=0;
		int givenNumSum=0;
		for(int i=0;i<arr.length;i++)
		{
			givenNumSum+=arr[i];
		}
		System.out.println("The given numbers givensum is:"+givenNumSum);
		for(int i=0;i<=7;i++)
		{
			totalSum+=i;
		}
		System.out.println("The total numbers sum is:"+totalSum);
		
		int missingNum=totalSum-givenNumSum;
		System.out.println("The missing number is:"+missingNum);
		 
	}

}
