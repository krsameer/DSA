// LeetCode: 4. Median of Two Sorted Arrays
// Time Complexity: O(log(min(m, n))) where m and n are the lengths of the two input arrays. We perform a binary search on the smaller array.
// Space Complexity: O(1) as we are using only a constant amount of extra space.

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0, high = m;

        while (low <= high) {

            int leftCountFromNums1 = (low + high) / 2;
            int leftCountFromNums2 = (m + n + 1) / 2 - leftCountFromNums1;

            int leftMax1 = (leftCountFromNums1 == 0)
                    ? Integer.MIN_VALUE
                    : nums1[leftCountFromNums1 - 1];

            int rightMin1 = (leftCountFromNums1 == m)
                    ? Integer.MAX_VALUE
                    : nums1[leftCountFromNums1];

            int leftMax2 = (leftCountFromNums2 == 0)
                    ? Integer.MIN_VALUE
                    : nums2[leftCountFromNums2 - 1];

            int rightMin2 = (leftCountFromNums2 == n)
                    ? Integer.MAX_VALUE
                    : nums2[leftCountFromNums2];

            // ✅ Correct partition found
            if (leftMax1 <= rightMin2 && leftMax2 <= rightMin1) {

                // Even total length
                if ((m + n) % 2 == 0) {
                    return (Math.max(leftMax1, leftMax2)
                          + Math.min(rightMin1, rightMin2)) / 2.0;
                }
                // Odd total length
                else {
                    return Math.max(leftMax1, leftMax2);
                }
            }

            // Move left
            else if (leftMax1 > rightMin2) {
                high = leftCountFromNums1 - 1;
            }

            // Move right
            else {
                low = leftCountFromNums1 + 1;
            }
        }

        throw new IllegalArgumentException("Invalid input");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2)); // 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(findMedianSortedArrays(nums3, nums4)); // 2.5
    }
}