package com.xupt.niuke;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace    {

    public static void main(String[] args) {
        final String we_are_happy = replaceSpace(new StringBuffer("We Are Happy"));
        System.out.println(we_are_happy);
    }
    public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.replace(i, i+1,"%20" );
            }
        }
        return str.toString();
    }
}
