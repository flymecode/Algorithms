package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/1
 */
public class TreeNode {
    public int val;
    public com.xupt.leetcode.TreeNode left;
    public com.xupt.leetcode.TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
