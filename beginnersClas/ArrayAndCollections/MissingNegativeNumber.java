package ArrayAndCollections;
//Find missing number in 1..N sequence including negative number
public class MissingNegativeNumber {
	public static void main(String args[])
	{
		int arr[]= {-3,-1,0,1,2,3};
		int min=arr[0];
		int max=arr[0];
		int expectedSum=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
			sum+=arr[i];
		}
		
		for(int i=min;i<=max;i++)
		{
			expectedSum+=i;
		}
		int missingNum=expectedSum-sum;
		System.out.println("The missing number is:"+missingNum);
		
	}
}



/*Input array: arr = {-2, -1, 0, 1, 3}

Initial variables:

min = arr[0] = -2

max = arr[0] = -2

sum = 0

Loop over the array (for (int num : arr)):

Iteration	num	check num < min	new min	check num > max	new max	sum before	sum after
1	-2	-2 < -2 → false	-2	-2 > -2 → false	-2	0	-2
2	-1	-1 < -2 → false	-2	-1 > -2 → true	-1	-2	-3
3	0	0 < -2 → false	-2	0 > -1 → true	0	-3	-3
4	1	1 < -2 → false	-2	1 > 0 → true	1	-3	-2
5	3	3 < -2 → false	-2	3 > 1 → true	3	-2	1

After loop finishes:

min = -2

max = 3

sum = 1 (actual sum of array elements -2 + -1 + 0 + 1 + 3 = 1)

4) Compute expected sum from min to max

You loop for (int i = min; i <= max; i++) expectedSum += i;

That adds: -2 + -1 + 0 + 1 + 2 + 3

Step-by-step:

expectedSum starts 0

add -2 → -2

add -1 → -3

add 0 → -3

add 1 → -2

add 2 → 0

add 3 → 3

So expectedSum = 3.

5) Find missing number

missingNumber = expectedSum - sum = 3 - 1 = 2 *\
 
 */
 
