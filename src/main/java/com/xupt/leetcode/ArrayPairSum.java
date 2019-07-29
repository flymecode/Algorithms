package com.xupt.leetcode;

import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i <nums.length ; i=i+2) {
            res += Math.min(nums[i], nums[i + 1]);
        }
        return res;
    }
}
