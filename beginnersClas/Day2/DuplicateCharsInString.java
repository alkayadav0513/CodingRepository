package Day2;
import java.util.*;
public class DuplicateCharsInString {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Map<Character,Integer> map = new HashMap<>();
		for(char ch:input.toCharArray())
		{
			{
				map.put(ch, map.getOrDefault(ch,0)+1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
		}
	}

}
