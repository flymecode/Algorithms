package com.xupt.niuke;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Queue<Integer> max = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length <= 0 || input.length < k || k <= 0) {
            return res;
        }
        for (int i : input) {
            if (max.size() < k) {
                max.add(i);
            } else {
                if (max.peek() > i) {
                    max.remove();
                    max.add(i);
                }
            }
        }
        while (!max.isEmpty()) {
            res.add(max.remove());
        }
        return res;
    }
}
