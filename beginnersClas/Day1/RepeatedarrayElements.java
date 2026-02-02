package Day1;

import java.util.HashMap;
import java.util.Map;

//
public class RepeatedarrayElements {
	public static void main(String args[])
	{
		int arr[]= {7,9,2,7,8,1,2,1,7,8,7};
		Map<Integer,Integer> countMap=new HashMap<>();
		for(int num:arr)
		{
			countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:countMap.entrySet())
		{
			if(entry.getValue()>=2)
			{
				System.out.print(entry.getKey()+"->"+entry.getValue()+",");
			}
		}
		
	}


}
