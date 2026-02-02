package Day2;
import java.util.*;
public class OccurenceOfEachWord {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str1= sc.nextLine();
		System.out.println("The entered string is:"+str1);
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:str1.toLowerCase().toCharArray())
		{
			if(map.containsKey(ch)){
				map.put(ch,map.getOrDefault(ch,0)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
}
}
