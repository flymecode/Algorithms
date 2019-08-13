package com.xupt.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author maxu
 * @description 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 * @date 2019-08-12
 */
public class CombinationSum {



    private int len;
    private int[] candidates;
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        if (len == 0) {
            return res;
        }
        Arrays.sort(candidates);
        this.len = len;
        this.candidates = candidates;
        findCombinationSum(target, 0, new Stack<>());
        return res;
    }

    private void findCombinationSum(int residue, int start, Stack<Integer> stack) {
        if (residue == 0) {
            res.add(new ArrayList<>(stack));
            return;
        } else {
            for (int i = start; i < len && residue - candidates[i] >= 0; i++) {
                stack.add(candidates[i]);
                findCombinationSum(residue - candidates[i], i, stack);
                stack.pop();
            }
        }
    }


    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int[] r = {2,3,6,7};
        List<List<Integer>> lists = combinationSum.combinationSum(r, 7);
        System.out.println(lists);
    }

}
