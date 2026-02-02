package String;
//reverse a string without using reverse function
import java.util.*;
public class reverseString {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String word= sc.nextLine();
		System.out.println("Entered word is: "+word);
		String reverse="";
		for(int i=word.length()-1;i>=0;i--)
		{
			reverse=reverse+word.charAt(i);
		}
		System.out.println("Orginal word:"+word);
		System.out.println("Reverse word:"+reverse);
			
	}

}
