package String;

import java.util.*;

//Remove duplicate characters from a string
public class RemoveDuplicateChars {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The entered input is:"+input);
		HashSet<Character> set=new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(char ch:input.toCharArray())
		{
			if(!set.contains(ch))
			{
				set.add(ch);
				sb.append(ch);
			}
			
		}
		System.out.println(sb.toString());
	}

}
