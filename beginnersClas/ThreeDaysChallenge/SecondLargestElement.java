package ThreeDaysChallenge;

public class SecondLargestElement {
	public static void main(String args[])
	{
		int arr[]= {12,45,9,41,23,16};
		int largest=Integer.MIN_VALUE;
		int SecondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				SecondLargest=largest;
				largest=arr[i];
				
			}
			else if(arr[i]>SecondLargest && arr[i]!=largest)
			{
				SecondLargest=arr[i];
			}
		}
		System.out.println("The second largest element in an array is:" +SecondLargest);
	}

}
