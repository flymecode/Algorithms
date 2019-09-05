package com.xupt.niuke;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-30
 */
public class Str {
    public static void main(String[] args) {
        System.out.println(func("aabcc", "dbbca", "aadbbcbcac"));
    }

    private static boolean func(String s1, String s2, String s3) {
        int l3 = s3.length();
        int l1 = s1.length();
        int i = 0;
        int j = 0;
        int m = 0;
        char[] str = new char[s2.length()];
        for (; i < l3 && j < l1; i++) {
            char c = s3.charAt(i);
            if (c == s1.charAt(j)) {
                j++;
            } else {
                str[m++] = c;
            }
        }
        for (int k = i; k < l3; k++) {
            str[m++] = s3.charAt(k);
        }
        String v = String.valueOf(str);
        if (v.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}
