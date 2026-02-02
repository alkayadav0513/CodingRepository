package ThreeDaysChallenge;
import java.util.*;
public class FirstRepeatedCharBruteForce {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The entered input is:"+input);
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<input.length();j++)
			{
				if(input.charAt(i)==input.charAt(j))
				{
					System.out.println("The first charcter is:"+input.charAt(i));
					return;
				}
			}
		}
		System.out.println("No repeating character is found");
	}

}
