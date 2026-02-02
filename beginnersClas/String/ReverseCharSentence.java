package String;
import java.util.*;
public class ReverseCharSentence {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("Then entered input is:"+input);
		String words[]=input.split(" ");
		StringBuilder result=new StringBuilder();
		for(String word:words)
		{
			result.append(new StringBuilder(word).reverse()).append(" ");
		}
		
		System.out.println("The reversed each word in sentence:"+result.toString().trim());
	}

}
