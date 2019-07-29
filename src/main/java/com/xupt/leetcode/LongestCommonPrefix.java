package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/2
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] r = {"aa", "a"};
        final String s = longestCommonPrefix(r);
        System.out.println(s);
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String str = strs[0];
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || str.charAt(i) != strs[j].charAt(i)) {
                    return s;
                }
            }
            s += str.charAt(i);
        }
        return s;
    }

}
