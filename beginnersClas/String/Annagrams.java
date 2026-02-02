package String;
import java.util.*;
public class Annagrams {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first word: ");
		String word1=sc.nextLine().toLowerCase();
		System.out.print("Enter the second word: ");
		String word2=sc.nextLine().toLowerCase();
		System.out.println("The first word is: "+word1+" and second word is: "+word2);
		char ch1[]=word1.toCharArray();
		char ch2[]=word2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
	    String str1= new String(ch1);
	    String str2= new String(ch2);
	    
	    if(str1.equals(str2))
	    {
	    	System.out.println("The given strings are anagram to each other");
	    }
	    else
	    {
	    	System.out.println("The given strings are not anagram to each other");
	    }
	    		
	}

}
