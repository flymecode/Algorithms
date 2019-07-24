package com.xupt.offer;

import java.util.*;

public class MinK {
    public static void main(String[] args) {
        int[] e = {4,5,1,6,2,7,3,8};
        int k = 8;
        GetLeastNumbers_Solution(e,k);

    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length <= 0) {
            return res;
        }
        Queue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (queue.size() < k) {
                queue.add(input[i]);
            } else {
                Integer max = queue.peek();
                if (max > input[i]) {
                    queue.remove();
                    queue.add(input[i]);
                }
            }
        }

        while(!queue.isEmpty()) {
            res.add(queue.remove());
        }
        return res;

    }
}
