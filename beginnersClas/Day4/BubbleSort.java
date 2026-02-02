package Day4;

public class BubbleSort {
	public static void main(String args[])
	{
		int arr[]= {7,2,0,1,8,2,11};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			
		}
		System.out.println("The sorted array is:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		
	}

}
