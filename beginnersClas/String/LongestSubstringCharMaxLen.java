package String;
//maxLength of substring without repeating character
import java.util.*;
public class LongestSubstringCharMaxLen {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		
		int start=0;
		int end=0;
		int maxLength=0;
		
		List<Character> list= new LinkedList<>();
		while(end<input.length())
		{
			char ch= input.charAt(end);
			if(!list.contains(ch))
			{
				list.add(ch);
				end++;
				maxLength=Math.max(maxLength, list.size());
			}
			else
			{
				list.remove(Character.valueOf(ch));
				start++;
			}
		}
		System.out.println("The maxLength of substring without repeating character is:"+maxLength);
		
	}

}

//we are using character.valueOf method because without using it , code with take ASCII value of character which leads to ArrayindexoutofbocException
