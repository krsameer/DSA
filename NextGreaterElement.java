// Next Greater Element
// Given an array of integers, find the next greater element for each element in the array. The next greater element for an element x is the first greater element on the right side of x in the array. If there is no greater element, output -1 for that element. 

import java.util.Stack;
public class NextGreaterElement {
    public static int[] nextGreaterOptimal(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) { 
            // Remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // If stack empty → no greater element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            // Push current element
            stack.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int[] res = nextGreaterOptimal(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}