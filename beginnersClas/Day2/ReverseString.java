package Day2;
import java.util.*;
//reverse string and palindrome program;
public class ReverseString {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The entered string input is: "+input);
		String reversed=new StringBuilder(input).reverse().toString();
		System.out.println("The reverse string is: "+reversed);
		if(reversed.equals(input))
		{
			System.out.println("The strings are palindrome");
		}
		else
		{
			System.out.println("The strings are not palindrome");
		}
		
	}
	

}
