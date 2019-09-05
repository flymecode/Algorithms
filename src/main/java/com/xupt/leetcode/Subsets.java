package com.xupt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-26
 */
public class Subsets {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        inOrder(nums, 0, res, null);
        return res;
    }

    private void inOrder(int[] nums, int i, List<List<Integer>> res, List<Integer> sub) {
        if (i >= nums.length){
            return;
        }
        sub = new ArrayList<>();
        inOrder(nums, i + 1, res, sub);
        sub.add(nums[i]);
        res.add(sub);
        inOrder(nums, i + 1, res, sub);
    }
}
