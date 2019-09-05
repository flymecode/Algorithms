package com.xupt.toutiao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-25
 */
public class T4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[][] res = new int[n-1][3];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = input.nextInt();
            }
        }
        System.out.println((int)Math.pow(k, k));
    }
}
