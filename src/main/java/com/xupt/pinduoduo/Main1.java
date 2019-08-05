package com.xupt.pinduoduo;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String[] a = str1.split(" ");
        String[] b = str2.split(" ");
        Integer pre = null;
        Integer cur = null;
        Integer next = null;
        for (int i = 1; i < a.length ; i++) {
            if (Integer.parseInt(a[i]) < Integer.parseInt(a[i - 1])) {
                pre = Integer.parseInt(a[i - 1]);
                cur = i;
                if (i != a.length - 1) {
                    next = Integer.parseInt(a[i+1]);
                }
                break;
            }
        }
        int max = pre;
        if (next != null) {
            for (int i = 0; i < b.length; i++) {
                Integer temp = Integer.parseInt(b[i]);
                if (temp > cur && temp < next) {
                    max = temp;
                }
            }
        } else {
            for (int i = 0; i < b.length; i++) {
                Integer temp = Integer.parseInt(b[i]);
                if (temp > cur ) {
                    max = temp;
                }
            }
        }
        if (max == pre) {
            System.out.println("NO");
            return;
        }
        a[cur] = String.valueOf(max);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
