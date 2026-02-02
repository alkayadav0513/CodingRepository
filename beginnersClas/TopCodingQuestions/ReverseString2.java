package TopCodingQuestions;
import java.util.*;
public class ReverseString2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String word=sc.nextLine();
		System.out.println("The entered input is:"+word);
		
		String reversed= new StringBuilder(word).reverse().toString();
		System.out.println("The reversed string is:"+reversed);
		
	}

}
