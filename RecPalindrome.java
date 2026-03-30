// Program to check if a string is a palindrome using recursion
// Time Complexity: O(n) where n is the length of the string, as we need to check each character at most once.
// Space Complexity: O(n) due to the recursive call stack.

import java.util.Scanner;

public class RecPalindrome {

    static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;

        if (Character.toLowerCase(str.charAt(left)) != 
            Character.toLowerCase(str.charAt(right))) {
            return false;
        }

        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}