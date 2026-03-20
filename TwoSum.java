//Leetcode 1. Two Sum
//Time Complexity: O(n) where n is the number of elements in the array, as we need to iterate through the array once to find the two numbers that add up to the target.
//Space Complexity: O(n) for using a hash map to store the indices of the numbers
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}