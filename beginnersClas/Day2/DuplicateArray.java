package Day2;
import java.util.*;
public class DuplicateArray {
	public static void main(String args[])
	{
		int arr1[]= {6,8,3,2,0,3,55,12};
		HashSet<Integer> map1=new HashSet<>();
		HashSet<Integer> duplicates=new HashSet<>();
		for(int num:arr1)
		{
			if(!map1.add(num))
			{
				duplicates.add(num);
			}
	   
	    }
		
		System.out.println(duplicates);
	    
		}
	}


