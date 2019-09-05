package com.xupt.niuke;

import java.util.Arrays;

/**
 * @author maxu
 * @description
 *
 * 有N个孩子站成一排，每个孩子有一个分值。给这些孩子派发糖果，需要满足如下需求：
 * 1、每个孩子至少分到一个糖果
 * 2、分值更高的孩子比他相邻位的孩子获得更多的糖果
 * 求至少需要分发多少糖果？
 * @date 2019-08-14
 */
public class FT {
    public static void main(String[] args) {
        int[] res = {0, 1, 0};
        int c = func(res);
        System.out.println(c);
    }

    private static int func(int[] res) {
        int[] num = new int[res.length];
        int n = res.length;
        num[0] = 1;
        num[n-1] = 1;
        for(int i = 1; i < n; i++) {
            if (res[i] > res[i-1]) {
                num[i] = num[i-1] + 1;
            }
        }
        for(int i = n - 2; i >= 0; i--) {
            if (res[i] > res[i+1] && num[i] < num[i+1] + 1) {
                num[i] = num[i+1] + 1;
            }
        }
        int count = 0;
        for (int i : num) {
            count += i;
        }
        return count;
    }
}
