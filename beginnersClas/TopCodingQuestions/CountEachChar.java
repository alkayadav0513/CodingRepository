package TopCodingQuestions;
import java.util.*;
public class CountEachChar {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String word=sc.nextLine().toLowerCase();
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c:word.toCharArray())
		{
			
			
				map.put(c, map.getOrDefault(c,0)+1);
			
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			
			
				System.out.println(entry.getKey()+"->"+entry.getValue());
			
		}
	}

}

