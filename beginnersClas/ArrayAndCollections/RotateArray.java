package ArrayAndCollections;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // number of positions to rotate

        // Step 1: Normalize k (in case it's greater than array length)
        k = k % arr.length;

        // Step 2: Reverse the whole array
        reverse(arr, 0, arr.length - 1);

        // Step 3: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 4: Reverse remaining elements
        reverse(arr, k, arr.length - 1);

        // Step 5: Print rotated array
        System.out.print("Array after rotating by " + k + " positions: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Utility method to reverse part of array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
