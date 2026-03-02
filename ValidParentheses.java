// LeetCode: 20. Valid Parentheses
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// Time Complexity: O(n) for traversing the string once
// Space Complexity: O(n) in the worst case when all characters are opening brackets and we push them onto the stack. In the best case when the string is empty or all characters are closing brackets, the space complexity is O(1) as the stack will be empty.

import java.util.Stack;

class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {

            // push opening brackets
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {
                // if stack empty -> invalid
                if(stack.isEmpty())
                    return false;

                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // valid if stack empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}