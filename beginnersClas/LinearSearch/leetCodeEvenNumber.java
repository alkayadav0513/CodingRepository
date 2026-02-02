package LinearSearch;

public class leetCodeEvenNumber {
	public static void main(String args[])
	{
		int arr[]= {67,12,987,-12,981567,6234109};
		System.out.println(findNumbers(arr));
		System.out.println(digits(876));
		
	}
	static int findNumbers(int arr[]){
		int count=0;
		for(int nums:arr)
		{
			if(even(nums))
			{
				count++;
			}
			
		}
		return count;
	}
	static boolean even(int nums)
	{
		int numbersofDigit=digits(nums);
		return numbersofDigit %2 ==0;
	}
	
	static int digits(int nums)
	{
		if(nums<0)
		{
			nums=nums*-1;
		}
		if(nums==0)
		{
			return 1;
		}
		int count=0;
		while(nums>0)
		{
			count++;
			nums=nums/10;
		}
		return count;
	}
	//another to find the counts of digits
	static int digits2(int nums)
	{
		return (int)(Math.log(nums))+1;
	}
	

}
