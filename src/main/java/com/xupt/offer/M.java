package com.xupt.offer;

import java.util.Arrays;
import java.util.Scanner;

public class M {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] res = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            res[i] = in.nextInt();
        }
        Arrays.sort(res);

        for (int i = n - 1; i >= 2 ; i--) {
            int left = 0, right = i - 1;
            while(left < right) {
                if (res[left] + res[right] > res[i]) {
                    count += (right - left);
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        System.out.println(count);
    }
}
