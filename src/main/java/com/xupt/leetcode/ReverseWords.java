package com.xupt.leetcode;

import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        String s = reverseWords("Let's take LeetCode contest");
        System.out.println(s);
    }
    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        String res = "";
        for (int i = 0; i < str.length; i++) {
            res += (reverse(str[i]) + " ");
        }
        return res.trim();
    }

    private static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
    }
}
