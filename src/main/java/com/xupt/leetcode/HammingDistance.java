package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/1
 */
public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        int i = hammingDistance.hammingDistance(1, 5);
        System.out.println(i);

    }

    public int hammingDistance(int x, int y) {
        if (x == y) {
            return 0;
        }
        int res = x ^ y;
        int count = 0;
        while (res / 2 > 0) {
            if (res % 2 == 1) {
                count++;
            }
            res /= 2;
        }
        return ++count;
    }

}
