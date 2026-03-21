// Time Complexity: O(log n) for binary search.
// Space Complexity: O(1) for iterative version, O(log n) for recursive version due to the call stack.
//Leetcode 704. Binary Search

class BinarySearch {
  
    static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int key = 10;
        int result = binarySearch(arr, key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element is at " + result);
    }
}