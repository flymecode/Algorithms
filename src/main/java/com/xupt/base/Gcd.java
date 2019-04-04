package com.xupt.base;

/**
 * 最大公约数
 * @author maxu
 * @date 2019/3/26
 */
public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(2, 3));
    }
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);

    }
}
