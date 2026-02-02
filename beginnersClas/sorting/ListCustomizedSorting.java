package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListCustomizedSorting  implements Comparator<Integer> {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(2);
		a1.add(3);
		a1.add(1);
		a1.add(20);
		a1.add(3);
		
		System.out.println("Before Sorting:"+a1);
		
		//Natural/Ascending Order - Default Way
//		Collections.sort(a1);
//		System.out.println("Default Way - Natural/Ascending Sorting:"+a1);
		
		//Second way - Natural/Ascending Order- compare() method - IF else
//		Collections.sort(a1, new ListCustomizedSorting());
//		System.out.println("Customised Way - Natural/Ascending Sorting using compare method:"+a1);
		
		//Third way - Natural/Ascending Order- compare() method- ternary operator
//		Collections.sort(a1, new ListCustomizedSorting());
//		System.out.println("Natural/Ascending Sorting using compare method with ternary operation::"+a1);
		
		
		System.out.println("******Descending order******");
		//First Way - Descending Order - Default way
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("Descending order Sorting the Default wa:"+a1);
		
		//Second - Descending Order- compare() method - If else
		Collections.sort(a1, new ListCustomizedSorting());
		System.out.println("Descending order Sorting using compare method:"+a1);
		
		//Third way - Descending Order - compare() method - ternary operator
		Collections.sort(a1, new ListCustomizedSorting());
		System.out.println("Descending order Sorting using compare method with ternary operation:"+a1);

	}

	
	
	@Override
	public int compare(Integer a, Integer b) {

		//Ascending order for customized sorting
//		if(a<b) {
//			return -1;
//		}else if(a>b) {
//			return 1;
//		}else {
//			return 0;
//		}
		
		//Ascending order as ternary operator
//		int val = a<b ? -1 : a>b ? 1 : 0;
//		return val;
		
		
		//Descending order for customized sorting
//		if(a<b) {
//			return 1;
//		}else if(a>b) {
//			return -1;
//		}else {
//			return 0;
//		}
		
		//Descending order as ternary operator
		int val = a<b ? 1 : a>b ? -1 : 0;
		return val;
		
		
	}

	

}
