package com.xupt.leetcode;

import java.util.Stack;

/**
 * @author maxu
 * @date 2019/5/1
 */
public class Calculate {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        int calculate1 = calculate.calculate("100000000/1/2/3/4/5/6/7/8/9/10");
        System.out.println(calculate1);
    }

    public int calculate(String s) {
        Stack<Integer> num = new Stack();
        Stack<Character> flag = new Stack();
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                flag.push(c);
                num.push(Integer.parseInt(n));
                n = "";
            } else {
                n += String.valueOf(c);
            }
        }
        num.push(Integer.parseInt(n));
        while (!flag.isEmpty()) {
            char pop = flag.pop();
            if ('+' == pop) {
                num.push(num.pop() + num.pop());
            } else if ('-' == pop) {
                int one = num.pop();
                int two = num.pop();
                num.push(two - one);
            } else if ('*' == pop) {
                num.push(num.pop() * num.pop());
            } else if ('/' == (pop)) {
                int t1 = num.pop();
                int t2 = num.pop();
                num.push(t2 / t1);
            }
        }
        return num.pop();
    }
}
