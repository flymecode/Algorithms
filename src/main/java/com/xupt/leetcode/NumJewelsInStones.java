package com.xupt.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-26
 */
public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (set.contains(c)) {
                count++;
            }
        }
        return count;

    }
}
