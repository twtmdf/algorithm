package geek.leetcode.week01;

import java.util.Stack;

//https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
//lc150
//逆波兰式
public class Lc150EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for (String s : tokens) {
            if ("+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s)) {
                Integer b = stack.pop();
                Integer a = stack.pop();
                stack.push(calc(a,b,s));
            }else {
                // 操作数入栈
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
    private int calc (int a,int b,String op) {
        if ("+".equals(op)) return a + b;
        if ("-".equals(op)) return a - b;
        if ("*".equals(op)) return a * b;
        if ("/".equals(op)) return a / b;
        return 0;
    }
}
