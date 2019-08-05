package com.xupt.leetcode.tree;

import com.xupt.leetcode.TreeNode;

public class HasPathSum {

    private int sum;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        int temp = sum - root.val;
        if (root.left == null && root.right == null) {
            return temp == 0;
        }
        return hasPathSum(root.left, temp) || hasPathSum(root.right, temp);
    }

}
