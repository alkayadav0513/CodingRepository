package String;
//Write a program to find the count the occurrences of each characters
import java.util.*;
public class RepeatedCharacters {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine();
		char ch[]=input.toCharArray();
		HashMap<Character,Integer> mp= new HashMap<Character,Integer>();
		for(char chrs:ch)
		{
			if(mp.containsKey(chrs))
			{
				mp.put(chrs,mp.get(chrs)+1);
			}
			else
			{
				mp.put(chrs, 1);
			}
			
		}
		System.out.println(mp);
		}
	}
