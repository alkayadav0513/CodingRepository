package AlgorithmAndLogics;
//find the length of the longest substring without repeating characters.
import java.util.*;
public class LongestSubstring {
	public static void main(String args[]) {
		String input="abcabcbb";
		
		int result =LongestSubstring(input);
		System.out.println("The result is:"+result);
		
	}
	public static int LongestSubstring(String s)
	{
		int right=0;
		int left=0;
		int maxlength=0;
		Set<Character> set=new HashSet<>(); 
		while(right<s.length())
		{
			char ch=s.charAt(right);
			if(set.contains(ch))
			{
				set.remove(s.charAt(left));
				left++;
			}
			else
			{
				set.add(ch);
				maxlength=Math.max(maxlength, right-left+1);
				right++;
				
			}
	}
		return maxlength;
	}
}


