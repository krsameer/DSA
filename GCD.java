//GCD of two numbers
// GeeksforGeeks https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
// Time Complexity: O(log(min(a, b))) for calculating the GCD using the Euclidean algorithm.
// Space Complexity: O(1) for using only a constant amount of extra space.
import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
}