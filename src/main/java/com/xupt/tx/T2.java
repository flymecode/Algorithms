package com.xupt.tx;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long sum = 0;
        long res = 0;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            sum += b[i] * n - a[i];
            arr[i] = a[i] - b[i];
        }
        Arrays.sort(arr);
        for (int i = 1; i <= n; i++) {
            res += arr[n - i] * i;
        }
        System.out.println(sum + res);

    }

}