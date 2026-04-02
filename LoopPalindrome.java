// This program checks if a given string is a palindrome using a loop to reverse the string.
// Time Complexity: O(n) where n is the length of the string, as we need to reverse the string and compare it with the original string.
// Space Complexity: O(n) as we are creating a new string to store the reversed version of the original string.

public class LoopPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}