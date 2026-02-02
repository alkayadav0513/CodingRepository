package ArrayAndCollections;

public class NonZeroEnd {
	public static void main(String args[])
	{
		int arr[]= {2,8,0,0,2,0,6,7,8};
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length)
		{
			arr[count]=0;
			count++;
		}
		System.out.print("Array after moving zeros to end: ");
		for(int num:arr)
		{
			System.out.print(num+",");
		}

	}

}
/*
 Step-by-Step Explanation
🔹 Input:
arr = [0, 1, 0, 3, 12]


Goal → Move all 0s to the end, keeping the order of non-zero elements same.
Expected Output → [1, 3, 12, 0, 0]

🔹 Step 1: Initialize a Counter
int count = 0;


count will represent the index where the next non-zero element should be placed.

Initially count = 0.

🔹 Step 2: Traverse the Array
for (int i = 0; i < arr.length; i++) {
    if (arr[i] != 0) {
        arr[count] = arr[i];
        count++;
    }
}


Let’s trace this logic:

i	arr[i]	Condition	Action	arr[] after iteration	count
0	0	false	skip	[0, 1, 0, 3, 12]	0
1	1	true	arr[0]=1	[1, 1, 0, 3, 12]	1
2	0	false	skip	[1, 1, 0, 3, 12]	1
3	3	true	arr[1]=3	[1, 3, 0, 3, 12]	2
4	12	true	arr[2]=12	[1, 3, 12, 3, 12]	3

After this loop:

arr = [1, 3, 12, 3, 12]
count = 3


The first 3 positions (0 to 2) now contain all non-zero elements.

🔹 Step 3: Fill Remaining Elements with Zero
while (count < arr.length) {
    arr[count] = 0;
    count++;
}


This loop replaces everything after the non-zero elements with zeros.

count	Action	arr[] after step
3	arr[3]=0	[1, 3, 12, 0, 12]
4	arr[4]=0	[1, 3, 12, 0, 0]

✅ Final array: [1, 3, 12, 0, 0]

🔹 Step 4: Print Result
System.out.print("Array after moving zeros to end: ");
for (int num : arr) {
    System.out.print(num + " ");
}


Output:

Array after moving zeros to end: 1 3 12 0 0  */
 