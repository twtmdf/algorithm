package geek.leetcode.week01;

import java.util.Stack;

//https://leetcode-cn.com/problems/valid-parentheses/
//lc25
public class Lc20ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        int len = s.length();
        for (int i = 0;i < len;i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            }else if (c == '[') {
                stack.push(']');
            }else if (c == '{') {
                stack.push('}');
            }else if (!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
