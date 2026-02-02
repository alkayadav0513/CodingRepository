package TopCodingQuestions;
import java.util.*;
public class longestSubstring {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The entered string is:"+input);
		int left=0,maxLength=0;
		HashSet<Character> set= new HashSet<>();
		for(int i=0;i<input.length();i++)
		{
			while(set.contains(input.charAt(i)))
			{
				set.remove(input.charAt(left));
				left++;
			}
			set.add(input.charAt(i));
			maxLength=Math.max(maxLength, i-left+1);
		}
		System.out.println("Longest length: " + maxLength);
		
	}

}
// input-abcabcbb
//output-3