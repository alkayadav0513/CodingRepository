package AlgorithmAndLogics;
import java.util.*;
public class PairSum2 {

	public static void main(String args[])
	{
		int arr[]= {6,8,2,9,3,6,4,1};
		int target=10;
		HashSet<Integer> seen=new HashSet<>();
		System.out.println("The pairs of elemts is equal to target:"+target);
		for(int num:arr)
		{
			int complement=target-num;
			if(seen.contains(complement))
			{
				System.out.println("The two pairs are:"+num+" "+complement);
			}
			seen.add(num);
		}
}
}
