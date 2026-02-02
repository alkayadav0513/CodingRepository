package String;

import java.util.Scanner;

public class NonRepeatedChars3 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The entered input is:"+input);
		char result=' ';
		for(int i=0;i<input.length();i++)
		{
		 	char c= input.charAt(i);
		 	
		 	if(input.indexOf(c)==input.lastIndexOf(c))
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
			System.out.println("Nonon repeated character found");
		}
		
	}

}
/*
 indexOf(c) → gives the first position of c

lastIndexOf(c) → gives the last position of c

If both are the same → it means the character appears only once
*/
