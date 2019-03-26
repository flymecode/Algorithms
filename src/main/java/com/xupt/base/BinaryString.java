package com.xupt.base;

/**
 * 将整数转化为二进制
 * @author maxu
 * @date 2019/3/26
 */
public class BinaryString {

    public static String toBinaryString(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        return s;
    }
}
