// Check whether a string is Palindrome using String Reversal
// Time Complexity: O(n) where n is the length of the string, as we need to reverse the string and compare it with the original string.
// Space Complexity: O(n) as we are creating a new string to store the reversed version of the original string.

import java.util.Scanner;
public class SRPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str.toLowerCase();
        String reversedStr=new StringBuilder(str).reverse().toString();

        if(str.equals(reversedStr)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
        sc.close();
    }
}