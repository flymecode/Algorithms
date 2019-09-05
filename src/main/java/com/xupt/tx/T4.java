package com.xupt.tx;

import java.util.*;

public class T4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrays = new int[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = in.nextInt();
        }

        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        long sum = 0;
        int minIndex = 0;
        while (minIndex < arrays.length) {
            for (int i = minIndex; i < arrays.length; i++) {
                if (arrays[i] < min) {
                    min = arrays[i];
                    minIndex = i;
                    sum += arrays[i];
                    max = Math.max(max, sum * min);
                } else {
                    sum += arrays[i];
                    max = Math.max(max, sum * min);
                }
            }
            min = Integer.MAX_VALUE;
            sum = 0;
            minIndex++;
        }
        System.out.println(max);
    }
}