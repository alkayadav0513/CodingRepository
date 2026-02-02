package Day2;
import java.util.*;
//An anagram is a word or phrase formed by rearranging the letters in another word or phrase.
public class Annagrams {
	public static void main(String args[]) {
		Scanner sc1= new Scanner(System.in);
		String str1=sc1.nextLine();
		String str2=sc1.nextLine();
		System.out.println("The two strings are:"+str1+","+str2);
		if(str1.length()==str2.length())
		{
			char[] ch1=str1.replaceAll("\\s+","").toLowerCase().toCharArray();
			char[] ch2=str2.replaceAll("\\s+","").toLowerCase().toCharArray();
			
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    
		    String strinput1=new String(ch1);
		    String strinput2=new String(ch2);
		    
		    if(strinput1.equals(strinput2))
		    {
		    	System.out.println("String are annagram to each other");
		    }
		    else
		    {
		    	System.out.println("String are not annagram to each other");
		    }
		}
		else
		{
			System.out.println("String are not annagram to each others");
		}
		
		
	}

}
