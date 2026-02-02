package String;

import java.util.*;
public class firstNonRepeatedCharcter {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		Character result=firstRepeaterCharc(input);
		
		if(result!=null)
		{
			System.out.println("First non-repeated character is: " + result);
		}
		else
		{
			System.out.println("No non-repeated character found.");
		}
	}
	public static Character firstRepeaterCharc(String input)
	{
		Map<Character,Integer> map= new LinkedHashMap<>();
		
		//count the frequency of character in string
		for(Character ch:input.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				return entry.getKey();
			}
		}
		return null;
	}
	

}
