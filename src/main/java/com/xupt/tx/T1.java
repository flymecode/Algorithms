package com.xupt.tx;

import java.util.Scanner;

/**
 * @author maxu
 * @description TODO
 * @date 2019-09-01
 */
public class T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 宝箱
        int n = input.nextInt();
        // 钥匙
        int m = input.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = input.nextInt();
        }
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            y[i] = input.nextInt();
        }
        // 奇数
        int b1 = 0;
        // 偶数
        int b2 = 0;
        for (int i = 0; i < n; i++) {
            if (isEven(b[i])) {
                b2++;
            } else {
                b1++;
            }
        }
        // 奇数
        int y1 = 0;
        // 偶数
        int y2 = 0;
        for (int i = 0; i < m; i++) {
            if (isEven(y[i])) {
                y2++;
            } else {
                y1++;
            }
        }
        int count = 0;
        count += Math.min(b1, y2);
        count += Math.min(b2, y1);
        System.out.println(count);

    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
