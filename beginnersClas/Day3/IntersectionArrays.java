package Day3;
import java.util.*;
public class IntersectionArrays {
	public static void main(String args[])
	{
		int []arr1= {2,7,9,2,6,7,11,6};
		int []arr2= {8,3,1,8,9,12,6,6};
		
		HashSet<Integer> seen= new HashSet<>();
		List<Integer> result = new ArrayList<>();
		for(int num:arr1)
		{
			seen.add(num);
		}
		for(int num2:arr2)
		{
			if(seen.contains(num2))
			{
				result.add(num2);
				seen.remove(num2);
			}
		}
		System.out.println(result);
		
	}

}
