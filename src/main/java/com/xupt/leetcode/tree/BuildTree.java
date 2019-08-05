package com.xupt.leetcode.tree;

import com.xupt.leetcode.TreeNode;

public class BuildTree {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = null;
        if (inorder.length == 0) {
            return null;
        }
        return buildTree(root, inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTree(TreeNode root, int[] inorder, int[] postorder, int l1, int r1, int l2, int r2) {
        if (l1 <= r1) {
            int mid;
            for (mid = l1;inorder[mid] != postorder[r2];mid++){}
            root = new TreeNode(inorder[mid]);
            root.left = buildTree(root.left,inorder, postorder, l1, mid-1, l2,l2+mid-1-l1);
            root.right = buildTree(root.right,inorder, postorder, mid+1, r1, r2-r1+mid,r2-1);
        }
        return root;
    }
}
