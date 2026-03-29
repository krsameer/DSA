//Counting Sort in Java
// Time Complexity: O(n + k) where n is the number of elements in the input array and k is the range of the input (the difference between the maximum and minimum values).
// Space Complexity: O(n + k) for the output array and the count array.

public class CountingSort {

    public static int[] countingSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int n = arr.length;

        // Step 1: Find max element
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        return output;
    }
}