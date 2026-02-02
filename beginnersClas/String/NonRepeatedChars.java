package String;
import java.util.*;
//Find the first non-repeated character in a string
public class NonRepeatedChars {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The entered input is:"+input);
		Map<Character,Integer> map=new HashMap<>();
		for(char ch:input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		char result=' ';
		for(char c:input.toCharArray())
		{
			if(map.get(c)==1)
			{
				result=c;
				break;
			}
		}
		
		if(result!=' ')
		{
			System.out.print("The first non repeated character is:"+result);
		}
		else
		{
			System.out.println("No non repeated character found");
		}
		
	}

}
