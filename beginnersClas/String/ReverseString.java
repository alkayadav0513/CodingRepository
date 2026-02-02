package String;
import java.util.*;
public class ReverseString {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine().toLowerCase();
		String reversed="";
		System.out.println("The entered input is:"+input);
		for(int i=input.length()-1;i>=0;i--)
		{
			reversed+=input.charAt(i);
		}
		System.out.println("The reverse word is:"+reversed);
	}

}
