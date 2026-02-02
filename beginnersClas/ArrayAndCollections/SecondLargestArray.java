package ArrayAndCollections;
//Find the second largest element in an array
public class SecondLargestArray {
	public static void main(String args[]) {
		int arr[]= {6,5,0,8,1,12,12,24,48};
		int largest=Integer.MIN_VALUE;
		int SecondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			if(num>largest)
			{
				SecondLargest=largest;
				largest=num;
			}
			else if(num>SecondLargest && num!=largest)
			{
				SecondLargest=num;
			}
		}
		System.out.println("The second largest element of an array is:"+SecondLargest);
	}

}

/*
 Step-by-Step Explanation

We’re looping through each number in the array, and this else if condition runs only if the number is not the largest, but is still bigger than the current second largest.

Let’s analyze each part:

✅ 1️⃣ num > secondLargest

👉 This checks if the current number is greater than the current second largest number found so far.

If it is, that means this number could be a new candidate for being the second largest.

✅ 2️⃣ num != largest

👉 This ensures that we don’t accidentally treat the largest number as the second largest.

Imagine the array has repeated largest numbers, like {10, 20, 20, 15} —
Without this check, the second occurrence of 20 might incorrectly become the second largest.

So num != largest keeps secondLargest distinct from the largest value.

✅ 3️⃣ secondLargest = num;

👉 If both conditions are true, we assign the current number to secondLargest.

That means we’ve found a new valid second largest number.

🧩 Example Walkthrough

Let’s use:

int[] arr = {10, 5, 8, 20, 15};

Step	num	largest	secondLargest	Condition triggered	Explanation
1	10	-∞	-∞	first if	new largest = 10
2	5	10	-∞	none	smaller
3	8	10	-∞ → 8	else if true (8 > -∞ && 8 != 10)	
4	20	10→20	8→10	first if (found new largest)	
5	15	20	10→15	else if true (15 > 10 && 15 != 20)	

✅ Final result:
largest = 20
secondLargest = 15

💡 In Simple Words

“If the current number isn’t the biggest, but it’s still larger than the current second biggest — update secondLargest.” */
