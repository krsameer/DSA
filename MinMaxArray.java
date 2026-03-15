//Min/max in array
//Time Complexity: O(n) for traversing the array once.
//Space Complexity: O(1) for using only a constant amount of extra space.

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}