package ArrayList;

import java.util.*;
public class MultiArrayListt
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		//Intialisation ArrayList
		for(int i=0;i<4;i++)
		{
		    list.add(new ArrayList<>());
		}
		//Adding the Element
		for(int i=0;i<4;i++)
		{
		    for(int j=0;j<4;j++)
		    {
		        list.get(i).add(sc.nextInt());
		    }
		}
		System.out.println(list);
		
	}
}