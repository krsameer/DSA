// Check whether a string is palindrome using two pointers
// Time Complexity: O(n) where n is the length of the string, as we need to check each character at most once.
// Space Complexity: O(1) as we are using only a constant amount of extra space for the two pointers.

import java.util.Scanner;

public class TPPalindrome {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a string");
    String str=sc.nextLine();
     int left=0;
     int right=str.length()-1;
     boolean isPalindrome=true;

     while(left<right){
        if(str.charAt(left) !=str.charAt(right)){
            isPalindrome=false;
            break;
        }
        left++;
        right--;
     }
     if(isPalindrome){
        System.out.println("It is palindrome");
     }
     else{
        System.out.println("It is not palindrome");
     }
     sc.close();
}
}