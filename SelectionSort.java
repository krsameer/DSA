// Selection Sort
// Selection Sort is a simple comparison-based sorting algorithm. It divides the input list into two parts: the sorted part at the left end and the unsorted part at the right end. Initially, the sorted part is empty and the unsorted part is the entire list. The algorithm repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted part and moves it to the end of the sorted part.
// Time Complexity: O(n^2) in all cases, as we need to traverse the unsorted part to find the minimum element for each position.
// Space Complexity: O(1) as it is an in-place sorting algorithm.

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array:");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}