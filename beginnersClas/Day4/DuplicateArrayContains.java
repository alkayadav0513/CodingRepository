package Day4;
import java.util.*;
public class DuplicateArrayContains {
	public static void main(String args[])
	{
		int arr[]= {5,7,8,4,9,2};
		HashSet<Integer> count=new HashSet<Integer>();
		boolean hasDuplicate = false;
		for(int num:arr)
		{
			if(!count.add(num))//// add() returns false if element already exists
			{
				hasDuplicate =true;
				break;
			}
		}
		if(hasDuplicate)
		{
			System.out.println("The array contains duplicate elements");
		}
		else
		{
			System.out.println("The array do not contains duplicate elements");
		}
	}

}
