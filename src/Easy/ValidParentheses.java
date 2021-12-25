package Easy;

import java.util.Stack;

/**
 * Diberikan string s yang hanya berisi karakter '(', ')', '{', '}', '[' dan ']',
 * tentukan apakah string input valid.
 * <p>
 * Example 1:
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "(]"
 * Output: false
 */

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty() || s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.peek() != '[' && s.charAt(i) == ']') {
                    return false;
                } else if (stack.peek() != '(' && s.charAt(i) == ')') {
                    return false;
                } else if (stack.peek() != '{' && s.charAt(i) == '}') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}
