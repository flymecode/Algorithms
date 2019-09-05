package com.xupt.toutiao;

import java.util.Scanner;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-25
 */
public class T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] str = new String[n];
        input.nextLine();
        for (int i = 0; i < n; i++) {
            str[i] = input.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(func(str[i]));
        }

    }

    public static boolean func(String str) {
        String[] s = str.split(" ");

        String[] s1 = s[0].split("\\.");
        String[] s2 = s[1].split("\\.");
        int[] v1 = new int[4];
        int[] v2 = new int[4];
        for (int i = 0; i < s1.length; i++) {
            v1[i] = Integer.valueOf(s1[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            v2[i] = Integer.valueOf(s2[i]);
        }
        for (int i = 0; i < 4; ++i) {
            if (v1[i] < v2[i]) {
                return true;
            }
            if (v1[i] > v2[i]) {
                return false;
            }
        }
        return false;
    }
}
