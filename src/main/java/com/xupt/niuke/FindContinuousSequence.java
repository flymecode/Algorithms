package com.xupt.niuke;

import java.util.ArrayList;

/**
 * @author maxu
 * @description 双指针解决
 * @date 2019-08-31
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int low = 1;
        int high = 2;
        while(high > low) {
            int cur = (low + high) * (high - low + 1) / 2;
            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    list.add(i);
                }
                low++;
                res.add(list);
            } else if(cur < sum) {
                high++;
            } else {
                low++;
            }
        }
        return res;

    }
}
