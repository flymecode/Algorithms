package com.xupt.jd;

import java.util.Scanner;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-24
 */
public class JD1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 输入人数
        int n = in.nextInt();
        // 身高
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        long cur = h[0];
        int count = 0;
        for (int i = 1; i < h.length ; i++) {
            if (cur > h[i]) {
                cur = h[i];
            }  else {
                count ++;
            }
        }
        cur = h[n-1];
        int count2 = 0;
        for (int i = h.length - 2; i >= 0; i--) {
            if (cur > h[i]) {
                cur = h[i];
            } else {
                count2++;
            }
        }
        int res = Math.min(count, count2);
        System.out.println(res);

    }
}
