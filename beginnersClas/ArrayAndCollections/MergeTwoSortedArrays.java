package ArrayAndCollections;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6,8,11};
        int[] arr2 = {3,8,7,10,13,17};

        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Step 1: Compare elements from both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Step 2: Copy remaining elements from arr1
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Step 3: Copy remaining elements from arr2
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        // Step 4: Print merged sorted array
        System.out.print("Merged array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}

