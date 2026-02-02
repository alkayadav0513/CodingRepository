package beginnersClas;
import java.util.*;
public class primeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		
		}
		if(isPrime)
		{
			System.out.println("This is a prime number");
		}
		else
		{
			System.out.println("This is not a prime number");
		}
	}

}
