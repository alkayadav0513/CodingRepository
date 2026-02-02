package String;
import java.util.*;
public class PalindromeString {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine();
		System.out.println("Entered word is: "+input);
		String word=new StringBuilder(input).reverse().toString();
		
		if(input.equals(word))
		{
			System.out.print("This is a plaindrome string");
		}
		else
		{
			System.out.print("This is not a plaindrome string");
		}
}

}
