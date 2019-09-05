package com.xupt.leetcode;

import java.util.*;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-23
 */
public class CountAndSay {
    static int[] m = {20, 10, 5, 4, 2, 1};
    static int count = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        back(i, 0);
        System.out.println(count);
    }


    public static void back(int n,int cur) {
        if (n == 0) {
            if (cur < count) {
                count = cur;
            }
        } else {
            for (int i = 0; i < m.length; i++) {
                n = n - m[i];
                if (n >= 0) {
                    back(n, cur + 1);
                }
                n = n + m[i];
            }
        }
    }

}
