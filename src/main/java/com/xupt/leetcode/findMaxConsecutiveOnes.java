package com.xupt.leetcode;

/**
 * 最大连续 1 的个数
 */
public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] res = {1,1,0,1,1,1};
        final int maxConsecutiveOnes = findMaxConsecutiveOnes(res);
        System.out.println(maxConsecutiveOnes);

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
            } else {
                if (temp > max) {
                    max = temp;
                }
                temp = 0;
            }
        }
        return max > temp ? max : temp;

    }
}
