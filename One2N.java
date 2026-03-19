//Print 1 to N without using loops
// GeeksforGeeks https://www.geeksforgeeks.org/print-1-to-n-without-using-loops/1
// Time Complexity: O(n) for printing numbers from 1 to n using recursion.
// Space Complexity: O(n) for the recursive call stack when printing numbers from 1 to n.
import java.util.Scanner;

public class One2N {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.print("Numbers from 1 to " + n + ": ");
        printNumbers(n);
    }
}