package com.xupt.offer;

import com.xupt.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<> ();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int cur = 1;
        int next = 0;
        ArrayList<Integer> s = new ArrayList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()) {
            TreeNode node = queue.remove();
            s.add(node.getVal());
            cur--;
            if(node.getLeft() != null) {
                queue.add(node.getLeft());
                next++;
            }
            if(node.getRight() != null) {
                queue.add(node.getRight());
                next++;
            }
            if(cur == 0) {
                cur = next;
                next = 0;
                res.add(s);
                s = new ArrayList<>();
            }
        }
        return res;
    }
}
