package com.xupt.leetcode;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class Solution_53 {

    public static void main(String[] args) {
        Solution_53 solution_53 = new Solution_53();
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubArray = solution_53.maxSubArray(array);
        System.out.println(maxSubArray);
    }

    public int maxSubArray(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = Math.max(nums[i], nums[i] + result[i - 1]);
        }
        Arrays.sort(result);
        return result[result.length - 1];
    }
}
