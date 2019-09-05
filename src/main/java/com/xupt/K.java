package com.xupt;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author maxu
 * @description TODO
 * @date 2019-09-04
 */
public class K {
    public static void main(String[] args) {
        String resolve = resolve("((ur)oi)");
        System.out.println(resolve);
    }

    static String resolve(String expr) {
        if (expr == null || expr.length() == 0) {
            return "";
        }
        List<Character> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int len = expr.length();
        for (int i = 0; i < len; i++) {
            if (expr.charAt(i) != ')') {
                stack.push(expr.charAt(i));
            } else {
                Character pop = stack.pop();
                while (pop != '(') {
                    list.add(pop);
                    pop = stack.pop();
                }
                if (i == len - 1) {
                    for (Character character : list) {
                        sb.append(character);
                    }
                    return sb.toString();
                }
                for (Character character : list) {
                    stack.push(character);
                }
                list.clear();
            }

        }
        return "";
    }
}
