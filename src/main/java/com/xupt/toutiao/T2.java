package com.xupt.toutiao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-25
 */
public class T2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 输入数字
        String[] a = in.nextLine().split(" ");
        // 输入字母
        String[] b = in.nextLine().split(" ");
        String[] res = new String[a.length + b.length];
        int m = 0;
        int i = 0;
        int j = 0;
        for (;i < a.length && j < b.length; m++) {
            if ((m + 1) % 5 != 0) {
                res[m] = a[i];
                i++;
            } else {
                res[m] = b[j];
                j++;
            }
        }
        if (i < a.length) {
            for (int k = i; k < a.length; k++) {
                res[m++] = a[k];
            }
        } else if (j < b.length) {
            for (int k = j; k < b.length; k++) {
                res[m++] = b[k];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : res) {
            sb.append(s + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
