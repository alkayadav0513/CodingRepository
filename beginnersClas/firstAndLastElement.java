package beginnersClas;

import java.util.ArrayList;

// Find the first element and last element of arrayList 
public class firstAndLastElement {
	public static void main(String args[])
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Alka");
		arrayList.add("Kristen");
		arrayList.add("Robert");
		arrayList.add("Jacob");
		arrayList.add("Taylor");
		
		if(!arrayList.isEmpty())
		{
			String firstElement=arrayList.get(0);
			System.out.println("The first element of an arrayList:"+firstElement);
			String lastElement=arrayList.get(arrayList.size()-1);
			System.out.println("The last element of an arrayList:"+lastElement);
		}
		else
		{
			System.out.println("The arrayList is emplty");
		}
	}

}
