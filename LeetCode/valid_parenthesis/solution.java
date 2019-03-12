/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.



Results:
Runtime: 4 ms, faster than 92.52% of Java online submissions for Valid Parentheses.
Memory Usage: 37 MB, less than 34.89% of Java online submissions for Valid Parentheses.
 */

class Solution {
    public boolean isValid(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {

            if (!stack.empty()) {
                if (chars[i] == ')' && stack.peek() != '(')
                    return false;
                else if (chars[i] == ']' && stack.peek() != '[')
                    return false;
                else if (chars[i] == '}' && stack.peek() != '{')
                    return false;

                if (chars[i] == ')' && stack.peek() == '(')
                    stack.pop();
                else if (chars[i] == ']' && stack.peek() == '[')
                    stack.pop();
                else if (chars[i] == '}' && stack.peek() == '{')
                    stack.pop();
                else
                    stack.push(chars[i]);
            } else
                stack.push(chars[i]);

        }
        if (stack.empty())
            return true;
        else
            return false;
    }
}