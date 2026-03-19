//Program to find mean of an array
//Time Complexity: O(n) where n is the number of elements in the array, as we need to iterate through the array once to calculate the sum.
//Space Complexity: O(1) for using only a constant amount of extra space to store the sum and mean.
// GeeksforGeeks https://www.geeksforgeeks.org/mean-of-an-array/1

public class MeanOfArray {

    public static double findMean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }


        public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double mean = findMean(arr);
        System.out.println("Mean of the array is: " + mean);
        }
}