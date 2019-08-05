package com.xupt.pinduoduo;

import java.util.Scanner;


public class Main2 {

    private static boolean flag = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.next();
        }
        fun(arr, n, 0);
        System.out.println(flag);
    }

    private static void fun(String[] arr, int n, int k) {
        if (k == n) {
            if (arr[k - 1].charAt(arr[k - 1].length() - 1) == arr[0].charAt(0)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        for (int i = k; i < n; i++) {
            if (k > 0 && (arr[k - 1].charAt(arr[k - 1].length() - 1) == arr[i].charAt(0))) {
                swap(arr, k, i);
                fun(arr, n, k + 1);
                swap(arr, k, i);
            } else if (k == 0) {
                swap(arr, k, i);
                fun(arr, n, k + 1);
                swap(arr, k, i);
            }
        }

    }
    public static void swap(String[] arr, int left, int right) {
        String temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}