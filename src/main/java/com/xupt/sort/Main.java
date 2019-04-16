package com.xupt.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author maxu
 * @date 2019/4/15
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = input.nextInt();
        }
        System.out.println(getPrice(a,b,n));
    }

    private static int getPrice(int[] a, int[] b, int n) {
        Arrays.sort(a);
        Arrays.sort(b);
        int n1 = 0;
        int n2 = 0;
        int l1 = n-1;
        int l2 = n-1;
        int j1 = n-1;
        int j2 = n-1;
        for (int i = 0; i < n; i++) {
            if (a[n1] > b[n2]) {
                n1++;
                n2++;
                j1++;
            } else if (a[n1] < b[n2]) {
                j2++;
                n1++;
                l2--;
            } else {
                if (a[l1] > b[l2]) {
                    j1++;
                    l1--;
                    l2--;
                } else if (a[n1] < b[l2]) {
                    j2++;
                    n1++;
                    l2--;
                } else {
                    break;
                }
            }
        }
        return j1 * 100 - j2 * 100;
    }
}
