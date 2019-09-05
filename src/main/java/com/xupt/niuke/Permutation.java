package com.xupt.niuke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Permutation {
    private ArrayList<String> res = new ArrayList<>();
    private char[] str;

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.trim().length() == 0) {
            return res;
        }
        this.str = str.toCharArray();
        backTrack(0, this.str.length);
        Collections.sort(res);
        return res;
    }

    private void backTrack(int c, int count) {
        if (c == count) {
            String s = String.valueOf(str);
            if (!res.contains(s)) {
                res.add(s + ",");
            }
        } else {
            for (int i = 0; i < count; i++) {
                swap(c, i, str);
                backTrack(c + 1, count);
                swap(c, i, str);
            }
        }
    }

    private void swap(int a, int b, char[] str) {
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }
}
