package ArrayQuestions;

/*Approach 1: Using Extra Array

Copy last K elements to new array

Shift the rest

Copy back*/

import java.util.Arrays;

public class RotateArray2 {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle cases where k > n

        int[] result = new int[n];

        // Copy last k elements to the beginning
        for (int i = 0; i < k; i++) {
            result[i] = arr[n - k + i];
        }

        // Copy first n-k elements to the rest
        for (int i = 0; i < n - k; i++) {
            result[k + i] = arr[i];
        }

        // Print result
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k); // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}
