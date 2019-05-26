package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/2
 */
public class Reverse {
    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);

    }

    public static int reverse(int x) {
        boolean flag = false;
        if (x < 0) {
            x = -x;
            flag = true;
        }
        int result = 0;
        while (x > 0) {
            int temp = result * 10 + x % 10;
            if (temp / 10 != result) return 0;
            result = temp;
            x /= 10;
        }
        if (flag) return -result;
        return result;
    }
}
