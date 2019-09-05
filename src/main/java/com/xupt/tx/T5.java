package com.xupt.tx;

import java.util.Scanner;

/**
 * @author maxu
 * @date 2019-09-01
 */
public class T5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long k = input.nextLong();

        long[] result = new long[t];
        for (int i = 0; i < t; i++) {
            long[] temp = new long[2];
            temp[0] = input.nextInt();
            temp[1] = input.nextInt();
            int count = 0;
            //全红
            count += temp[1] - temp[0] + 1;
            //全白一个
            count += 1;
            long max = temp[1];

            long kk = k;
            while (kk < max) {
                count += max - 1;
                kk *= 2;
            }
            result[i] = count;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(result[i] % 1000000007);
        }
    }
}
