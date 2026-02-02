package beginnersClas;

public class primeNumber3 {
	public static void main(String args[])
	{
		int start =1,end=100;
		printPrimeNumber(start,end);
	}
	
	public static void printPrimeNumber(int start, int end)
	{
		System.out.println("Prime numbers between " + start + " and " + end + " are:");
		for(int i =start;i<=end;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
		
		public static boolean isPrime(int n)
		{
			if(n<=1)
			{
				return false;
			}
		
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		}
	}


