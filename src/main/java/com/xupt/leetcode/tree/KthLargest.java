package com.xupt.leetcode.tree;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {

    private int k;
    private Queue<Integer> queue = null;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        assert(nums == null);
        queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
    }

    public int add(int val) {
        int t = queue.peek();
        queue.add(val);
        if(queue.size() > k) {
            queue.poll();
        }
        return t > val? t: val;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {4,5,8,2};
        KthLargest kthLargest = new KthLargest(3, arr);
        int a = kthLargest.add(3);   // returns 4
        int b = kthLargest.add(5);   // returns 5
        int c = kthLargest.add(10);  // returns 5
        int d = kthLargest.add(9);   // returns 8
        int e = kthLargest.add(4);   // returns 8
        System.out.printf("%d,%d,%d,%d,%d",a,b,c,d,e);
    }
}
