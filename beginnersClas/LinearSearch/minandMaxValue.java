package LinearSearch;

import java.util.*;

public class minandMaxValue {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the element in an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		for (int a : arr) {
			System.out.println(a + ",");
		}
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		System.out.println(minValue);

	}

}
