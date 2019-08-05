package com.xupt.niuke;

public class NumberOf1 {
    public int NumberOf1(int n) {
        boolean isF = false;
        if (n < 0) {
            isF = true;
            n = -n;
        }
        int res = 0;
        while(n > 0) {
            n = n / 2;
            res++;
        }
        return isF ? res + 1 : res;
    }
}
