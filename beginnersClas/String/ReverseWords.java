package String;

import java.util.*;

//Reverse words in a sentence (“I am SDET” → “SDET am I”)
public class ReverseWords {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The entered input is:"+input);
		String[] words=input.split(" ");
		String reversed="";
		for(int i=words.length-1;i>=0;i--)
		{
			reversed+=words[i]+" ";
		}
		
		System.out.println("The reversed sentence is: "+reversed);
	}

}
