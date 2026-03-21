//First and Last Occurrence of an Element in a Sorted Array
//Time Complexity: O(log n) for binary search.
//Space Complexity: O(1) for iterative version, O(log n) for recursive version

class FirstAndLastOccurrence {
    public int firstOccurrence(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                if (mid == 0 || arr[mid - 1] < key) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int lastOccurrence(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                if (mid == arr.length - 1 || arr[mid + 1] > key) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}