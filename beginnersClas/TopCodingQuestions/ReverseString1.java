package TopCodingQuestions;
import java.util.*;
public class ReverseString1 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine();
		System.out.println("The entered input is:"+input);
		String result="";
		for(int i=input.length()-1;i>=0;i--)
		{
			result=result+input.charAt(i);
		}
		System.out.println("The reversed string is:"+result);
	}
	

}
