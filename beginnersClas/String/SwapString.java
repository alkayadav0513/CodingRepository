package String;
//Write a Java program swap two String without using 3rd variable
import java.util.*;
public class SwapString {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1=sc.nextLine();
		System.out.print("Enter the second string: ");
		String str2=sc.nextLine();
		System.out.println("The fisrt string is:"+str1+ " and the secoond string is:"+str2+" before swapping");
		str1=str1+str2;
		//extract the initial part(Original string str1)from the concatenated.
		str2=str1.substring(0,str1.length()-str2.length());
		//extract the remaining part(Original string str2)from the concatenated.
		str1=str1.substring(str2.length());
		System.out.println("The fisrt string is:"+str1+ " and the secoond string is:"+str2+" after swapping");
	}

}
