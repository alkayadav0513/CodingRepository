package AlgorithmAndLogics;
//Find all pairs in an array whose sum equals a given number
public class PairsSum {
	
	public static void main(String args[])
	{
		int arr[]= {6,7,2,8,0,1};
		int target=9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
				}
			}
			
		}
		
	}

}
