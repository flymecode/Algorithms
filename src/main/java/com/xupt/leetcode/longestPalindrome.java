package com.xupt.leetcode;


import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author maxu
 * @description TODO
 * @date 2019-09-04
 */
public class longestPalindrome {
    public static void main(String[] args) {
    }

    /*private static int longestPalindrome(String s) {
        int[] c = new int[58];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'A']++;
        }
        int count = 0;
        boolean odd = false;
        for (int value : c) {
            if (value % 2 == 0) {
                count += value;
            } else {
                odd = true;
                count += (value - 1);
            }
        }
        return odd ? count + 1 : count;
    }*/

}
