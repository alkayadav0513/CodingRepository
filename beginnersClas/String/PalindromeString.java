package String;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine().toLowerCase();
		System.out.println("The entered input is:"+input);
		String reversed=new StringBuilder(input).reverse().toString();
		System.out.println("The reversed word is:"+reversed);
		if(input.equals(reversed))
		{
			System.out.println("String are palindrome");
		}
		else
		{
			System.out.println("String are not palindrome");
		}
		
	}

}
