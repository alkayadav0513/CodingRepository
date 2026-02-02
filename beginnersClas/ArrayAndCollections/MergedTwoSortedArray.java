package ArrayAndCollections;
//Merge two sorted array
public class MergedTwoSortedArray {
	
	public static void main(String args[])
	{
		int arr1[]= {1,3,5,6,8,11};
		int arr2[]={3,8,7,10,13,17};
		
		int merged[]=new int[arr1.length + arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				merged[k++]=arr1[i++];
			}
			else
			{
				merged[k++]=arr2[j++];
			}
		}
		
		while(i<arr1.length)
		{
			merged[k++]=arr1[i++];
		}
		while(j<arr2.length)
		{
			merged[k++]=arr2[j++];
		}
		
		for(int num:merged)
		{
			System.out.print(num+",");
		}
		
	}

}

/*1️⃣ Input Arrays
int[] arr1 = {1, 3, 5, 7};
int[] arr2 = {2, 4, 6, 8};


Both arrays are already sorted.

arr1 and arr2 will be merged into one sorted array.

2️⃣ Create a Result Array
int[] merged = new int[arr1.length + arr2.length];


merged will store all elements of both arrays.

Size = sum of lengths of arr1 and arr2 → 4 + 4 = 8.

3️⃣ Initialize Pointers
int i = 0, j = 0, k = 0;


i → index for arr1

j → index for arr2

k → index for merged

4️⃣ Compare and Merge
while (i < arr1.length && j < arr2.length) {
    if (arr1[i] < arr2[j]) {
        merged[k++] = arr1[i++];
    } else {
        merged[k++] = arr2[j++];
    }
}


This loop runs until one array is fully processed.

Compare current elements:

If arr1[i] is smaller → copy it into merged[k] and move i and k forward.

Otherwise, copy arr2[j] and move j and k.

5️⃣ Copy Remaining Elements (arr1)
while (i < arr1.length) {
    merged[k++] = arr1[i++];
}


If arr2 finished first, some elements might remain in arr1.

This loop adds all remaining elements from arr1.

6️⃣ Copy Remaining Elements (arr2)
while (j < arr2.length) {
    merged[k++] = arr2[j++];
}


Similarly, if arr1 finished first, add remaining elements from arr2.

7️⃣ Print the Result
System.out.print("Merged array: ");
for (int num : merged) {
    System.out.print(num + " ");
}


Prints the merged array elements sequentially.*/
