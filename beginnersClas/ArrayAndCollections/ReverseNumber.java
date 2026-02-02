package ArrayAndCollections;
import java.util.*;
public class ReverseNumber {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("The entered number is:"+num);
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println("The reversed number is:"+rev);
		if(rev==temp)
		{
			System.out.println("The numbers are pallindrame");
		}
		else
		{
			System.out.println("The number are not pallindrame");
		}
	}

}
/*
 *How It Works

% 10 → Extracts the last digit of the number.

* 10 + digit → Builds the reversed number digit by digit.

/ 10 → Removes the last digit from the original number.
*/
