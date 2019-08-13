package com.xupt.sort;

import java.util.Scanner;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-09
 */
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] num = new long[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextLong();
        }
        long count = 0;
        int l = 0;
        int r = num.length - 1;
        if (num.length == 1) {
            System.out.println(0);
            return;
        }
        while (l + 1 < r) {
            if (l + 1 < r && num[l] < num[l + 1]) {
                l++;
                continue;
            } else {
                long t = num[l] - num[l + 1];
                count += t + 1;
                num[l + 1] = num[l + 1] + t + 1;
            }
            if (l + 1 < r && num[r] < num[r - 1]) {
                r--;
                continue;
            } else {
                long t = num[r] - num[r - 1];
                count += t + 1;
                num[r - 1] = num[r - 1] + t + 1;
            }
        }
        System.out.println(count);
    }
}
