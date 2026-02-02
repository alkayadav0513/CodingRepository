package LinearSearch;

import java.util.Arrays;

public class linearSearch4 {
	public static void main(String args[])
	{
		String word="Mosharraf";
		char target='a';
		System.out.println(Arrays.toString(word.toCharArray()));
		Boolean result=linearSearch4method(word,target);
		System.out.println(result);
		
	}
	
	
	static boolean linearSearch4method(String word,char target)
	{
		if(word.length()==0)
		{
			return false;
		}
		
		for(char c:word.toCharArray())
		{
			if(c==target)
			{
				return true;
			}
		}
		return false;
	}
	
	

}
