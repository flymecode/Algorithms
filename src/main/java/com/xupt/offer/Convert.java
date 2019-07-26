package com.xupt.offer;

import com.xupt.leetcode.TreeNode;

public class Convert {

    private TreeNode pre = null;
    private TreeNode head = null;
    public TreeNode Convert(TreeNode root) {
        inOrder(root);
        return head;
    }

    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        node.setLeft(pre);
        if (pre != null) {
            pre.setRight(node);
        }
        pre = node;
        inOrder(node.getRight());
    }

}
