import java.util.*;

public class NQueens {

    // Check if placing a queen at (r, c) is safe
    static boolean isSafe(int r, int c, char[][] board, int n) {

        // Check same column above
        for (int i = 0; i < r; i++) {
            if (board[i][c] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Backtracking function
    static void placeQueens(int r, int n, char[][] board, List<List<String>> solutions) {

        // All queens placed → store solution
        if (r == n) {
            List<String> config = new ArrayList<>();
            for (char[] row : board) {
                config.add(new String(row));
            }
            solutions.add(config);
            return;
        }

        // Try placing queen in each column of current row
        for (int c = 0; c < n; c++) {

            if (isSafe(r, c, board, n)) {

                board[r][c] = 'Q';          // place queen
                placeQueens(r + 1, n, board, solutions);
                board[r][c] = '.';          // backtrack
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> solutions = new ArrayList<>();

        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        placeQueens(0, n, board, solutions);
        return solutions;
    }

    // Driver code
    public static void main(String[] args) {

        int n = 4;

        List<List<String>> result = solveNQueens(n);

        System.out.println("Total solutions: " + result.size());
        for (List<String> board : result) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
