package TopCodingQuestions;
//Find first non-repeating character
import java.util.*;
public class FirstRepeatingChar {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String word= sc.nextLine();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char ch:word.toCharArray())
		{
			
				map.put(ch, map.getOrDefault(ch, 0)+1);
			
			
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("The first non repeated charcter is:"+entry.getKey());
			}
		}
	}

}
