package Day4;
import java.util.*;
//Reverse elements of a list using Iterator
/*
listIterator(list.size()) → positions the iterator after the last element.

hasPrevious() → checks if there’s a previous element.

previous() → moves backward and returns the previous element.
 
 An Iterator in Java is an interface in the java.util package that provides a way to traverse elements of a collection sequentially, one element at a time. It is part of the Java Collections Framework and is commonly used to iterate through collections like ArrayList, HashSet, or LinkedList.
 
 */
public class IteratorListString {
	public static void main(String args[])
	{
		List<String> list= new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Mango");
		list.add("Banana");
		list.add("Watermelon");
		
		System.out.println("List is: " + list);
		
		List<String> reversed= new ArrayList<>();
		
		ListIterator<String> it= list.listIterator(list.size());
		
		while(it.hasPrevious())
		{
			reversed.add(it.previous());
			
			//System.out.print(it.previous()+",");
		}
		System.out.print("reversed list is"+reversed);
	}
	
	

}
