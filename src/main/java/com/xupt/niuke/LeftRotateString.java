package com.xupt.niuke;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-31
 */
public class LeftRotateString {
    public static void main(String[] args) {
        String str = leftRotateString("abcXYZdef", 3);
        System.out.println(str);
    }
    public static String leftRotateString(String str,int n) {
        if (str == null || str.length() == 0) {
            return "";
        }
        n = n % str.length();
        return str.substring(n) + str.substring(0, n);
    }
}
