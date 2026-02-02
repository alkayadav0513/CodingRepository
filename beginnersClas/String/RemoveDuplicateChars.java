package String;
import java.util.*;
public class RemoveDuplicateChars {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		String result=removeDuplicateChar(input);
		System.out.println("The string after removing duplicate chars is:"+result);
		
	}
	public static String removeDuplicateChar(String word)
	{
		Set<Character> set1=new HashSet<>();
		StringBuilder result=new StringBuilder();
		for(char ch:word.toCharArray())
		{
			if(set1.add(ch))
			{
				result.append(ch);
			}
		}
		return result.toString();
	}

}
