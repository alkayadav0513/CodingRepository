package Day3;
import java.util.*;
public class FirstNonRepeatedChar {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("Entered input is:"+input);
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:input.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("The first non-repeated charcter is:"+entry.getKey());
			}
		}
	}

}
