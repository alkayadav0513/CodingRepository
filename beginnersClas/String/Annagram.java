package String;
import java.util.*;
public class Annagram {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine().toLowerCase();
		String input2=sc.nextLine().toLowerCase();
		System.out.println("The entered input1:"+input1+" input2:"+input2);
		char word1[]=input1.toCharArray();
		char word2[]=input2.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		String string1= new String(word1);
		String string2= new String(word2);
		
		if(string1.equals(string2))
		{
			System.out.println("Strings are annagram to each other");
		}
		else
		{
			System.out.println("Strings are not annagram to each other");
		}
	}

}
