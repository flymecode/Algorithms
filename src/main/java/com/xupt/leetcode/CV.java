package com.xupt.leetcode;

import java.util.Stack;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-24
 */
public class CV {
    public static String insertBlanks(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                result += " " + s.charAt(i) + " ";
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static int exp(String ex) {
        Stack<Integer> opd = new Stack<>();
        Stack<Character> opt = new Stack<>();
        ex = insertBlanks(ex);
        String[] tokens = ex.split(" ");
        for (String token : tokens) {
            if (token.length() == 0) {
                continue;
            } else if(token.charAt(0) == '+' || token.charAt(0) == '-') {
                while (!opt.isEmpty() && (opt.peek() == '-') || opt.peek() == '+' || opt.peek() == '/'|| opt.peek() == '*') {
                    pro(opd, opt);
                }
                opt.push(token.charAt(0));
            } else if(token.charAt(0) == '*' || token.charAt(0) == '/') {
                while (!opt.isEmpty() && (opt.peek() == '/'|| opt.peek() == '*')) {
                    pro(opd, opt);
                }
                opt.push(token.charAt(0));
            }else if(token.trim().charAt(0) == '(') {
                opt.push('(');
            } else if(token.trim().charAt(0) == ')') {
                while(opt.peek() != '(') {
                    pro(opd, opt);
                }
                opt.pop();
            } else {
                opd.push(Integer.parseInt(token));
            }
        }
        while (!opt.isEmpty()) {
            pro(opd, opt);
        }
        return opt.pop();

    }

    public static void pro(Stack<Integer> opd,Stack<Character> opt) {
        char op = opt.pop();
        int op1 = opd.pop();
        int op2 = opd.pop();

    }
}
