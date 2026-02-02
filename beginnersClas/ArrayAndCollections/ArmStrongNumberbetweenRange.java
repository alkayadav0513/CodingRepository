package ArrayAndCollections;
//Find All Armstrong Numbers Between 1 and 1000
public class ArmStrongNumberbetweenRange {
	public static void main(String args[])
	{
		for(int i=1;i<=1000;i++)
		{
			if(isArmstrong(i))
			{
				System.out.println("The armstrong numbers are:"+i);
			}
		}
	}
	
	public static boolean isArmstrong(int num)
	{
		int originalNumber=num;
		int sum=0;
		int digits=String.valueOf(num).length();
		
		while(num>0)
		{
			int rem=num%10;
			sum+=Math.pow(rem, digits);
			num=num/10;
		}
		return sum==originalNumber;
	}

}
