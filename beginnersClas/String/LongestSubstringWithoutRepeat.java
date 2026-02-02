package String;
import java.util.*;
public class LongestSubstringWithoutRepeat {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The entered input is:"+input);
		int result=longestSubstring(input);
		System.out.println("Length of longest substring: "+result);
	}
	
	public static int longestSubstring(String s)
	{
		int left=0;
		int right=0;
		int maxLength=0;
		Set<Character> set= new HashSet<>();
		while(right<s.length())
		{
			char ch=s.charAt(right);
			
			// // If duplicate found, shrink window from left
			if(set.contains(ch))
			{
				set.remove(s.charAt(left));
				left++;
				
			}
			//// Add current character and update max length
			else
			{
				set.add(ch);
				maxLength=Math.max(maxLength, right-left+1);
				right++;
			}
			
		}
		return maxLength;
	}

}
