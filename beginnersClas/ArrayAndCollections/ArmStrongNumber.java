package ArrayAndCollections;
import java.util.*;
//A number is called an Armstrong number if the sum of its digits raised to the power of the number of digits equals the original number.
public class ArmStrongNumber {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		System.out.println("The entered number is:"+num);
		int temp=num;
		int sum=0;
		//count the number of digit
		int digits=String.valueOf(num).length();
		while(num!=0)
		{
			int rem=num%10;
			sum+=Math.pow(rem, digits);
			num=num/10;
		}
		System.out.println("The number after operation:"+sum);
		if(temp==sum)
		{
			System.out.println("The number is Armstrong number:");
		
		}
		else
		{
			System.out.println("The number is not Armstrong number:");
		}


}
}
/*
1️⃣ digits = 3 (because 153 has 3 digits)
2️⃣ Extract each digit:

3 → 3³ = 27

5 → 5³ = 125

1 → 1³ = 1
3️⃣ Sum = 1 + 125 + 27 = 153
✅ Since sum == original, it’s an Armstrong number.
*/
