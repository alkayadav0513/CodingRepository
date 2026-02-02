package String;
//Write a program to replace second repeated EY from below sentence "I work in EY and EY is good company " with code explanation
import java.util.*;
public class ReplaceSecondOccurence {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String Sentence=sc.nextLine();
		System.out.println("The entered sentence is:"+Sentence);
		
		String words[]=Sentence.split(" ");
		String target="EY";
		String replacement="IBM";
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(target))
			{
				count++;
				if(count==2)// replace only second EY
				{
					words[i]=replacement;
					break;
				}
			
		}
	}
		// // Join the words back into sentence
		String result=String.join(" ", words);
		System.out.println("The modified sentence is: "+result);
	}

}
