//CeilTheFloor problem in Unsorted Arrays
// Time Complexity: O(n) where n is the length of the array, as we need to traverse the entire array to find the floor and ceil.
// Space Complexity: O(1) as we are using only a constant amount of extra space for the floor and ceil variables.

public class CeilTheFloorUSA {

    public static int[] getFloorAndCeil(int[] arr, int x) {
        int floor = -1;
        int ceil = -1;

        for (int num : arr) {

            // Check for floor
            if (num <= x) {
                if (floor == -1 || num > floor) {
                    floor = num;
                }
            }

            // Check for ceil
            if (num >= x) {
                if (ceil == -1 || num < ceil) {
                    ceil = num;
                }
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7;

        int[] result = getFloorAndCeil(arr, x);

        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }
}