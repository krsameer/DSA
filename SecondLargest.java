//Second largest element in an array
//Time Complexity: O(n) for traversing the array once.
//Space Complexity: O(1) for using only a constant amount of extra space.

public class SecondLargest {
  

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

      public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element is: " + secondLargest);
    }
}