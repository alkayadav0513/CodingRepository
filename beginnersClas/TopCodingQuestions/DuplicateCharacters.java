package TopCodingQuestions;
//Find duplicate characters in a string
import java.util.*;
public class DuplicateCharacters {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String word=sc.nextLine().toLowerCase();
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c:word.toCharArray())
		{
			if(map.containsKey(c));
			{
				map.put(c, map.getOrDefault(c,0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
		}
	}

}
