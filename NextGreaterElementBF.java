// Brute Force Approach for Next Greater Element
// Given an array of integers, find the next greater element for each element in the array. The next greater element for an element x is the first greater element on the right side of x in the array. If there is no greater element, output -1 for that element. 
// Time Complexity: O(n^2) due to nested loops
// Space Complexity: O(n) for the result array

public class NextGreaterElementBF {
    public static int[] nextGreaterBrute(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1; // default
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break; // stop at first greater
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int[] res = nextGreaterBrute(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}