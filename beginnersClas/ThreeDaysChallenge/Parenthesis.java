package ThreeDaysChallenge;
import java.util.*;
public class Parenthesis {
	public static void main(String args[])
	{
		String str="{}[]()";
		System.out.println(isValid(str));
	}
	
	private static boolean isValid(String str)
	{
		Stack<Character> stack = new Stack<>();
		for(char c:str.toCharArray())
		{
			if(c=='{'|| c=='['|| c=='(')
			{
				stack.push(c);
			}
			else
			{
				if(stack.isEmpty())
				{
					return false;
				}
				char top=stack.pop();
				if(c=='{' && top!='}')
				{
					return false;
				}
				if(c=='[' && top!=']')
				{
					return false;
				}
				if(c=='(' && top!=')')
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
		//If stack is empty it means it has valid parenthesis
	}

}
