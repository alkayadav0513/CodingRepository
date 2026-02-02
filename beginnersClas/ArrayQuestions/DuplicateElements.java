package ArrayQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
	public static void main(String args[])
	{
		int arr[]= {1,6,8,9,2,4,6,4};
		HashSet<Integer> result =findDuplicate(arr);
		if (result.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements: " + result);
        }
		
	}
	public static HashSet<Integer> findDuplicate(int arr[])
	{
		HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num); // already seen → duplicate
            }
        }
        return duplicates;
		
	}

}
