//Leetcode 62. Unique Paths
//Solving using recursion
//Time Complexity: O(2^(m+n)) in the worst case, as each call can lead to two additional calls.
//Space Complexity: O(m+n) for the recursion stack in the worst case, as the maximum depth of the recursion can be m+n when we are at the bottom-right corner of the grid.  

public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int result = uniquePaths(m, n);
        System.out.println("Number of unique paths are " + result);
    }

    public static int uniquePaths(int m, int n) {
        // Base case: If we are at the last row or last column, there is only one path to the destination
        if (m == 1 || n == 1) {
            return 1;
        }
        // Recursive case: The number of paths to reach (m, n) is the sum of paths to reach (m-1, n) and (m, n-1)
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }
}