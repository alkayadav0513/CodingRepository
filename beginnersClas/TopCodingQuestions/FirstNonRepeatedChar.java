package TopCodingQuestions;

import java.util.*;

public class FirstNonRepeatedChar {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The entered input is:"+input);
		HashSet<Character> set= new HashSet<>();
		for(char ch:input.toCharArray())
		{
			if(set.contains(ch))
			{
			System.out.println("The first non-repeated charcter:"+ch);
			return;
			}
			set.add(ch);
		}
		System.out.println("No repeating character is found");
	}

}
