package Day2;
import java.util.*;
public class RemoveDuplicateChars {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine();
		HashSet<Character> seen=new HashSet<>();
		StringBuilder result = new StringBuilder();
		for(char ch:input.toCharArray())
			if(!seen.contains(ch))
			{
				seen.add(ch);
				result.append(ch);
			}
		
		System.out.println("The string after remove duplicate character is: "+result.toString());
		
		
	}

}
