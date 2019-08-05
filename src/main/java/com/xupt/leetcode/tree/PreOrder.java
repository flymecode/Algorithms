package com.xupt.leetcode.tree;

import com.xupt.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class PreOrder {
    private List<Integer> res = new ArrayList<>();
    public List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }

        res.add(root.getVal());
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
        return res;
    }
}
