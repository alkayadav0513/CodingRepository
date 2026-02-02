package Day2;
import java.util.*;
public class RemoveDuplicateArrayElements {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=5;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int num:arr)
		{
			System.out.println(num);
		}
		
		// Convert array to list
		List<Integer> list=new ArrayList<>();
		for(int num:arr)
		{
			list.add(num);
		}
		// Use LinkedHashSet to remove duplicates
		Set<Integer> set=new LinkedHashSet<>(list);
		
		// Convert back to array (optional)
		
		int uniqueElement[]=set.stream().mapToInt(Integer::intValue).toArray();
		System.out.println("Original Array:"+Arrays.toString(arr));
		System.out.println("Array after removing duplicates "+Arrays.toString(uniqueElement));
		
	}

}
