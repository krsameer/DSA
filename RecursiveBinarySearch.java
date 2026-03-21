//Java program for recursive binary search.
// Time Complexity: O(log n) for binary search.
// Space Complexity: O(1) for iterative version, O(log n) for recursive version

class RecursiveBinarySearch {
    public int binarysearch(int[] arr, int k) {
        return helper(arr, 0, arr.length - 1, k);
    }
    public int helper(int[] arr, int left, int right, int k) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == k) {
            int leftResult = helper(arr, left, mid - 1, k);
            return (leftResult == -1) ? mid : leftResult;
        } 
        else if (arr[mid] < k) {
            return helper(arr, mid + 1, right, k);
        } 
        else {
            return helper(arr, left, mid - 1, k);
        }
    }
}