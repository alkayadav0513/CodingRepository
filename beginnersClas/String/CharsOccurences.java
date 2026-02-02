package String;

import java.util.*;

//Count occurrences of each character in a string
public class CharsOccurences {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine().toLowerCase();
		System.out.println("The entered input is:"+input);
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:input.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		
		for(Map.Entry<Character,Integer> charcount:map.entrySet())
		{
			System.out.println(charcount.getKey()+"->"+charcount.getValue());
		}
		
	}

}
