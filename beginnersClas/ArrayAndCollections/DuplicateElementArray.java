package ArrayAndCollections;
import java.util.*;
//Find duplicate elements in an array
public class DuplicateElementArray {

	public static void main(String args[]) {
		int arr[]= {1,7,9,3,2,1,9,7};
		HashMap<Integer,Integer> map= new HashMap<>();
		
		for(int num:arr)
		{
			map.put(num, map.getOrDefault(num,0)+1);
		}
		
		for(Map.Entry<Integer, Integer> count:map.entrySet())
		{
			if(count.getValue()>1)
			{
				System.out.println("The duplicate elements are:"+count.getKey());
			}
		}
	}
 	
}
