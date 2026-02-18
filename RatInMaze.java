//Rat in a Maze Problem
//Solved using backtracking
//Time Complexity: O(4^(n*n)) in worst case when all cells are open
//Space Complexity: O(n*n) for visited array and recursion stack

import java.util.*;

public class RatInMaze {

    static int n;

    // Check whether the cell is safe to move
    static boolean isSafe(int r, int c, int[][] maze, boolean[][] visited) {
        return r >= 0 && c >= 0 && r < n && c < n
                && maze[r][c] == 1
                && !visited[r][c];
    }

    // Backtracking function to explore all paths
    static void explore(int r, int c,
                        int[][] maze,
                        boolean[][] visited,
                        String path,
                        List<String> paths) {

        // Destination reached
        if (r == n - 1 && c == n - 1) {
            paths.add(path);
            return;
        }

        // Mark current cell as visited
        visited[r][c] = true;

        // Down
        if (isSafe(r + 1, c, maze, visited))
            explore(r + 1, c, maze, visited, path + "D", paths);

        // Left
        if (isSafe(r, c - 1, maze, visited))
            explore(r, c - 1, maze, visited, path + "L", paths);

        // Right
        if (isSafe(r, c + 1, maze, visited))
            explore(r, c + 1, maze, visited, path + "R", paths);

        // Up
        if (isSafe(r - 1, c, maze, visited))
            explore(r - 1, c, maze, visited, path + "U", paths);

        // Backtrack
        visited[r][c] = false;
    }

    static List<String> findAllPaths(int[][] maze) {
        n = maze.length;
        List<String> paths = new ArrayList<>();

        // If start is blocked
        if (maze[0][0] == 0) return paths;

        boolean[][] visited = new boolean[n][n];
        explore(0, 0, maze, visited, "", paths);

        Collections.sort(paths); // optional
        return paths;
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        List<String> result = findAllPaths(maze);

        if (result.isEmpty())
            System.out.println("No path found");
        else
            System.out.println(result);
    }
}
