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
            char a = s.charAt(i);
            if (stack.empty() || a == '(' || a == '{' || a == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.peek() != '[' && a == ']') {
                    return false;
                } else if (stack.peek() != '(' && a == ')') {
                    return false;
                } else if (stack.peek() != '{' && a == '}') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}
