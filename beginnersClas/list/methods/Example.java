package list.methods;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		//As part of collection , we cannot create a list of primitive type
		//ArrayList<float> a = new ArrayList<float>();
		
		
		//List of homogeneous data
		ArrayList<Float> a1 = new ArrayList<Float>();
		 
		System.out.println(a1);//[]
		
		System.out.println("***********add()***************");
		//Add() method is to add to the list
		a1.add(100F); //index number 0
		a1.add(10F);//index number 1
		a1.add(40F);//index number 2
		a1.add(20F);//index number 3
		a1.add(20F);//index number 4
		
		System.out.println("List is :"+a1); //[100.0, 10.0, 40.0, 20.0, 20.0]
		
		System.out.println("**********size()**************");
		
		//Size() - method to check the size of the collection
		int sizeList = a1.size();
		System.out.println("Size of the float list is "+sizeList);//5
		
		System.out.println("**********get(index Number)**************");
		//[100.0, 10.0, 40.0, 20.0, 20.0]
		//Get() method to get element from the list
		Float f1 = a1.get(3);
		System.out.println("Data at index 3 is "+f1); //20.0
		
		//Float f2 = a1.get(6); //Exception = IndexOutOfBoundsException
		//System.out.println("Data at index 6 is "+f2);
		
		System.out.println("***********For Loop****************");
		for(int x = 0; x<sizeList; x++) {
			System.out.println(a1.get(x));
		}
		
		
		System.out.println("*********For Each Loop**********");
		
		System.out.println("Print elements on the list");
		for(Float a:a1) {
			System.out.println(a);
		}
		
		System.out.println("*************add(int index, Element value)**********************");
		//[100.0, 10.0, 40.0, 20.0, 20.0]
		//Add(int index, Element value) - Add element at the last
		a1.add(5, 23F);
		System.out.println(a1); //[100.0, 10.0, 40.0, 20.0, 20.0, 23.0]
		
		a1.add(3, 2F);
		System.out.println(a1); //[100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		
		System.out.println("************************");
		//[100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		//Size() - method to check the size of the collection
		int sizeList1 = a1.size();
		System.out.println("Size of the float list is "+sizeList1);//7
		
		System.out.println("List after adding an element: "+a1); //[100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		
		
	
		System.out.println("***********Add another heterogeneous collection*************");
		ArrayList<Object> a2 = new ArrayList<Object>();
		
		a2.add("Kaushik"); //String value at index 0
		a2.add(72.5); //Double value at index 1
		a2.add(50); //Integer value at index 2
		
		System.out.println("List of object: "+a2);//[Kaushik, 72.5, 50]
		
		System.out.println("**********addAll(Collection c)**************");
		//a1 = [100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		//a2 = [Kaushik, 72.5, 50]
		//Appends all of the elements in the specified collection to the end of this list
		a2.addAll(a1);
		
		System.out.println("List of object after adding collection of floats is : "+a2);//[Kaushik, 72.5, 50, 100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		System.out.println("List after adding an element: "+a1); // 100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0
		
		System.out.println("**********addAll(int index , Collection c)**************");
		/*
		 * Inserts all of the elements of the specified collection into this list,
		 * starting at the specified position. Shifts the element currently at that
		 * position (if any) and any subsequent elements to the right (increases their
		 * indices).
		 */
		//a2 = [Kaushik, 72.5, 50, 100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		//a1 = [100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		a2.addAll(2, a1);
		
		
		//a2 = [Kaushik, 72.5, 100.0, 10.0, 40.0, 20.0, 20.0, 23.0, 50, 100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		System.out.println("List of object after adding collection of floats again : "+a2);
		
		System.out.println("***************contains()********************");
		System.out.println(a1); //[100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		boolean b1 = a1.contains(101F);
		System.out.println(b1); //false 
		
		boolean b2 = a1.contains(10F);
		System.out.println(b2); //true
		
		System.out.println("***************indexOf(Element value)********************");
		
		//a1 = [100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		int i1 = a1.indexOf(20.0F); //Index of first occurrence of 20.0 from LHS
		System.out.println("Index number of first occurance of 20.0 is "+i1); //4
		
		
		//There is no overloading function of indexOf() method  - So error
		//int i2 = a1.indexOf(20.0F, 4)//Index of first occurrence of 20.0 from LHS
		//System.out.println("Index number of first occurrence of 20.0 is "+i2);
		
		//int i3 = a1.indexOf(20.0F, 5)//Index of Second occurrence of 20.0 from LHS
		//System.out.println("Index number of second occurrence of 20.0 is "+i3);
		
		//Index of element not present will give -1 -> we can use this method for search in LIST
		int i4 = a1.indexOf(201.0F); //Index of element not existing in list
		System.out.println("Index number of element not existing in list is "+i4);
		
		
		System.out.println("***************lastIndexOf(Element Value)******************");
		//a1 = [100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		int i5 = a1.lastIndexOf(20.0F); //The second occurence of 20.0 index number thrown
		System.out.println(i5);//5
		
		System.out.println("***************isEmpty()********************");
		//a1 = [100.0, 10.0, 40.0, 2.0, 20.0, 20.0, 23.0]
		//Returns true if this list contains no elements.
		boolean b3 = a1.isEmpty();
		System.out.println("Is a1 empty? "+b3); //false
		
		
		
		
		System.out.println("***********Add another homogeneous collection*************");
		ArrayList<Double> d1 = new ArrayList<Double>();
		System.out.println("Empty list: "+d1); //[]
		
		boolean b4 = d1.isEmpty();
		System.out.println("Is d1 empty? "+b4); //true
		
		d1.add(23D); //Index number 0
		System.out.println("Double list: "+d1); //[23.0]
		d1.add(24D); //Index number 1
		System.out.println("Double list: "+d1); //[23.0,24.0]
		d1.add(25D);//Index number 2
		d1.add(25D); //Index number 3
		
		System.out.println(d1);//[23.0,24.0, 25.0, 25.0]
		
		System.out.println("***************lastindex()********************");
		System.out.println("Double list: "+d1); //[23.0, 24.0, 25.0, 25.0]
		int a3 = d1.lastIndexOf(25.0D);
		System.out.println(a3);  //3
		int a4 = d1.lastIndexOf(23.0D);
		System.out.println(a4);//0
		int a44 = d1.indexOf(23.0);
		System.out.println(a44);//0
		
		int a5 = d1.indexOf(25.0D);
		System.out.println(a5);//2
		
		System.out.println("***************remove(int index)********************");
		//d1 = [23.0, 24.0, 25.0, 25.0]
		System.out.println("Double list: "+d1);//[23.0, 24.0, 25.0, 25.0]
		Double d2 = d1.remove(2);
		System.out.println(d2); //First occurrence of 25.0 removed from list
		
		System.out.println("Double list after removing first occurence of 25.0 is : "+d1);//[23.0, 24.0, 25.0]
		
		System.out.println("***************remove(Element Value)********************");
		//d1 = [23.0, 24.0, 25.0]
		boolean b5 = d1.remove(23.0D);
		System.out.println(b5);//true
		
		System.out.println("Double list after removing 23.0 is : "+d1);//[24.0, 25.0]
		
		System.out.println("***************removeall(Collection c)********************");
		//d1 = [24.0, 25.0]
		boolean b6 = d1.removeAll(d1);
		System.out.println(b6); //true
		
		System.out.println("Double list after removing all: "+d1);//[]
		//d1 = []
		
		d1.add(23D);
		d1.add(24D);
		d1.add(25D);
		d1.add(26D);
		
		System.out.println("Double list after adding elements again : "+d1);//[23.0, 24.0, 25.0, 26.0]
		//d1 = [23.0, 24.0, 25.0, 26.0]
		
		
		System.out.println("******************set(int index, Element value)*******************");
		//Replaces the element at the specified position in this list with the specified element.
		//d1 = [23.0, 24.0, 25.0, 26.0]
		Double d3 = d1.set(1, 100.12D);
		System.out.println(d3);//24.0 is replaced
		
		System.out.println("Double list after replacement element at index 1 : "+d1);//[23.0, 100.12, 25.0, 26.0]
		
		
		System.out.println("******************subList(int beginindex, int endindex)*******************");
		/*Returns a view of the portion of this list between the specified fromIndex, inclusive, 
		and toIndex, exclusive.*/
		//d1 = [23.0, 100.12, 25.0, 26.0]
		System.out.println(d1);//[23.0, 100.12, 25.0, 26.0]
		List<Double> l3 = d1.subList(1, 3);
		System.out.println(l3); //[100.12, 25.0]
		
		System.out.println("******************addAll(int index, Collection<? extends Double> c)*******************************");
		//d1 = [23.0, 100.12, 25.0, 26.0]
		//l3 = [100.12, 25.0]
		System.out.println(d1);//[23.0, 100.12, 25.0, 26.0]
		boolean b7 = d1.addAll(1, l3);
		System.out.println(b7); //true
		
		System.out.println(d1);//[23.0, 100.12, 25.0, 100.12, 25.0, 26.0]
		
		System.out.println("***************clone()*****************");
	    System.out.println(a1); //[100.0, 10.0, 40.0, 20.0, 20.0, 23.0]
	    //a1=[100.0, 10.0, 40.0, 20.0, 20.0, 23.0]
		Object o1 = a1.clone();
		System.out.println(o1);//[100.0, 10.0, 40.0, 20.0, 20.0, 23.0]
		System.out.println(o1.getClass().getName());
		
		
		
		System.out.println("***************clear()*****************");
		System.out.println(a1);
		// a1=[100.0, 10.0, 40.0, 20.0, 20.0, 23.0]
		a1.clear();
		System.out.println(a1);//[]
		
		
	}

}

