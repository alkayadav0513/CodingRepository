package ArrayAndCollections;
//Remove duplicates from an array (using HashSet or Streams)
import java.util.*;
public class RemoveDuplicateElements {
	public static void main(String args[]) {
		int arr[]= {2,6,11,7,8,11,23,98,11,6};
		HashSet<Integer> seen=new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		for(int num:arr)
		{
			if(!seen.contains(num))
			{
				duplicates.add(num);
			}
		}
		
		System.out.println("The array after removing duplicate elements are:");
		for(int num:duplicates)
		{
			System.out.print(num+",");
		}
		
	}
	

}
