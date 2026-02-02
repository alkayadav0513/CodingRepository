package LinearSearch;

public class leetCodesum2 {
	public static void main(String args[]){
		int arr[][]= {
				{1,2,3},
				{4,1,6},
				{3,3,7}
				
		};
		int ans=maximunWealth(arr);
		System.out.println(ans);
	}



public static int maximunWealth(int[][]accounts) {
	//int sum=0;
	int sum=Integer.MIN_VALUE;
	
	for(int person=0;person<accounts.length;person++)
	{
		int rowSum=0;
		for(int account=0;account<accounts[person].length;account++)
		{
			rowSum=rowSum+accounts[person][account];
		}
		//check max sum
		if(rowSum>sum)
		{
			sum=rowSum;
		}
	}
	return sum;
	
	
}



}

