package com.xupt.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个整数数组  nums 和一个正整数 k，找出是否有可能把这个数组分成 k 个非空子集，其总和都相等。
 */
public class CanPartitionKSubsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int avg = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
            count += num;
        }
        avg = count / k;
        int temp = list.get(0);
        list.remove(0);
        while (!list.isEmpty()) {
            if (avg - temp > 0) {
                temp = avg - temp;
            } else if (avg - temp == 0) {
                list.remove(1);
            } else {
                return false;
            }
        }
        return true;
    }
}
