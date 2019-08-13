package com.xupt.leetcode;

import sun.applet.AppletResourceLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author maxu
 * @description 全排列
 * @date 2019-08-10
 */
public class Permute {

    public static void main(String[] args) {
        Permute permut = new Permute();
        int[] res = {1, 2, 3};
        permut.permute(res);
    }

    private int[] nums;
    private int length;
    private List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.length = nums.length;
        res = new ArrayList<>();
        backTrack(0);
        return res;
    }

    private void backTrack(int t) {
        if (t == length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(list);
            System.out.println(Arrays.toString(nums));
        } else {
            for (int i = t; i < length; i++) {
                swap(nums, t, i);
                backTrack(t + 1);
                swap(nums, t, i);
            }
        }
    }

    private void swap(int[] nums, int r1, int r2) {
        int t = nums[r1];
        nums[r1] = nums[r2];
        nums[r2] = t;
    }
}
