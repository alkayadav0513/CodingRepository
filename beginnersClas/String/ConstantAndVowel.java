package String;
import java.util.*;
//Find the number of vowels and consonants in a string
public class ConstantAndVowel {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine();
		System.out.println("The entered input is:"+input);
		int vowels=0;
		int consonants=0;
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(Character.isLetter(c))
			{
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			
			
		}
		System.out.println("Vowels:"+vowels+" Consonants:"+consonants);
	}

}
