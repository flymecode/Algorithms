package com.xupt.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_103 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List result = new ArrayList();
        List<Integer> item = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        if (root != null) {
            stack1.push(root);
        }
        Stack<TreeNode> stack = stack1;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            TreeNode cur = stack.pop();

            if (stack == stack1) {
                if (cur.left != null) {
                    stack2.push(cur.left);
                }
                if (cur.right != null) {
                    stack2.push(cur.right);
                }
                item.add(cur.val);
            } else {
                if (cur.right != null) {
                    stack1.push(cur.right);
                }
                if (cur.left != null) {
                    stack1.push(cur.left);
                }
                item.add(cur.val);
            }

            result.add(item);
            if (stack1.isEmpty()) {
                stack = stack1;
            } else {
                stack = stack2;
            }
        }

        return result;
    }
}
