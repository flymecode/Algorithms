package com.xupt.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-23
 */
public class RomanToInt {
    public static void main(String[] args) {
        int iii = romanToInt("IV");
        System.out.println(iii);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> res = new HashMap<>();
        res.put('I', 1);
        res.put('V', 5);
        res.put('X', 10);
        res.put('L', 50);
        res.put('C', 100);
        res.put('D', 500);
        res.put('M', 1000);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            int p = res.get(s.charAt(i));
            if (i == s.length() - 1) {
                c += res.get(s.charAt(i));
                break;
            }
            int n = res.get(s.charAt(i + 1));
            if (p >= n) {
                c += p;
            } else {
                c -= p;
            }

        }
        return c;
    }
}
