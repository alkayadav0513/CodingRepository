package beginnersClas;

import java.util.HashSet;
import java.util.Set;

//Find c
public class CommonElementArray {
	public static void main(String args[])
	{
		int arr1[]= {4,8,6,12,6,23};
		int arr2[]= {4,8,9,12,6,22};
		Set<Integer> sc1=findCommonElement(arr1, arr2);
		System.out.println("The common elements are:"+sc1);
		//uncommon elements
		//System.out.println("The uncommon elements are:"+sc1);
	}
	public static Set<Integer> findCommonElement(int arr1[], int arr2[])
	{
		Set<Integer> set1= new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		
		for(int num:arr1)
		{
			set1.add(num);
		}
		for(int num:arr2)
		{
			//if(set1.contains(num))
			if(set1.contains(num))
			{
				set2.add(num);
			}
		}
		return set2;
		
	}

}
