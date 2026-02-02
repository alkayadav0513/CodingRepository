package ArrayAndCollections;
import java.util.*;
public class ArrayIntersection {
	public static void main(String args[])
	{
		int arr1[]= {1,3,2,4,5,6,9};
		int arr2[]= {88,66,4,12,56,9};
		HashSet<Integer> set1=new HashSet<Integer>();
		List<Integer> result = new ArrayList<>();
		for(int num:arr1)
		{
			set1.add(num);
		}
		for(int num2:arr2)
		{
			if(set1.contains(num2))
			{
				result.add(num2);
				set1.remove(num2);
			}
		}
		
		System.out.println("The intersection two arrays are:"+result);
		
	}

}
