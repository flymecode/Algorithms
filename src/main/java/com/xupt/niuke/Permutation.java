package com.xupt.niuke;

import java.util.ArrayList;
import java.util.prefs.BackingStoreException;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Permutation {
    private int count;
    private StringBuilder sb = new StringBuilder();
    private char[] str;
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.trim().length() == 0) {
            return res;
        }
        this.count = str.length()-1;
        this.str = str.toCharArray();
        backTrack(0);
        res.add(sb.toString());
        return res;
    }

    private void backTrack(int c) {
        if (c > count) {
            sb.append(",");
        } else {
            for (int i = 0; i < count - 1; i++) {
                swap(c,i,str);
                sb.append(str[i]);
                backTrack(c + 1);
                swap(c,i,str);
                sb.delete(sb.length() - 1, sb.length());
            }
        }
    }

    private void swap(int a, int b, char[] str) {
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }
}
