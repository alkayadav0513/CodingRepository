package TopCodingQuestions;
//Remove duplicate characters from a string
import java.util.*;
public class RemoveDuplicateChar {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String word= sc.nextLine();
		HashSet<Character> set= new HashSet<>();
		StringBuilder result=new StringBuilder();
		for(char ch:word.toCharArray())
		{
			if(!set.contains(ch))
			{
				set.add(ch);
				result.append(ch);
			}
		}
		
		System.out.println("The word after remove duplicate charcter:"+result.toString());
				
				
	}
}


