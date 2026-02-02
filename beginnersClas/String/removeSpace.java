package String;
//Write a java program to remove white space from given string
import java.util.*;
public class removeSpace{
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the string");
	String str1=sc.nextLine();
	StringBuilder result= new StringBuilder();
	for(int i=0;i<str1.length();i++)
	{
		if(str1.charAt(i)!=' ')
		{
			result.append(str1.charAt(i));
		}
		
	}
	System.out.println(result.toString());

}
}
