package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/1
 */
public class CountPrimes {

    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(get(i)){
                count++;
            }
        }
        return count;
    }

    private boolean get(int i) {
        return false;

    }
}
