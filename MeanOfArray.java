//Program to find mean of an array

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