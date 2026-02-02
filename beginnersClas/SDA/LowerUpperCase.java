package SDA;
//convert Write a program to convert HeXaWArE to hExAwaRe in java 
//Using method 1
import java.util.*;
/*public class LowerUpperCase {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String word=input.nextLine();
		System.out.println("Entered word is: "+word);
		char ch[]= word.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				ch[i]=Character.toLowerCase(ch[i]);
			}
			else if(Character.isLowerCase(ch[i]))
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
			
		}
		String result= new String(ch);//convert char back to an string.
		System.out.println("The original word:"+word);
		System.out.println("The modified word:"+result);
	}

}*/
//convert Write a program to convert HeXaWArE to hExAwaRe in java 
//Using method 2-Using string Builder
public class LowerUpperCase{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String word=input.nextLine();
		System.out.println("Entered word is: "+word);
		StringBuilder result = new StringBuilder();
		for(char c:word.toCharArray())
		{
			if(Character.isUpperCase(c))
			{
				result.append(Character.toLowerCase(c));
			}
			else if(Character.isLowerCase(c)){
				
				{
					result.append(Character.toUpperCase(c));
				}
			}
			else
			{
				result.append(c);
			}
		}
		System.out.println("The original word:"+word);
		System.out.println("The modified word:"+result.toString());
	}
}

