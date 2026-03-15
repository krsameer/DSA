//Leetcode 62. Unique Paths
//Solving using recursion

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