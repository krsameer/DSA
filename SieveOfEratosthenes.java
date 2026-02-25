// Approach
// Create a boolean array of size n+1 and initialize all entries as true. A value in the boolean array will finally be false if it is Not a prime, else true.
// Start with the first prime number, which is 2. Mark all of its multiples as false
// Repeat the process for the next number in the boolean array. If it is true, then it is a prime number. Mark all of its multiples as false.
// Continue the process until you have processed numbers up to √n. The remaining true values in the
// boolean array will be prime numbers.
// Time Complexity: O(n log log n) for generating all prime numbers up to n.
// Space Complexity: O(n) for the boolean array to keep track of prime numbers.

import java.util.*;

class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

}