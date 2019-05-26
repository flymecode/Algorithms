package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/1
 */
public class SortedArrayToBST {

    TreeNode root = null;
    public TreeNode sortedArrayToBST(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
             add(nums[i]);
        }
        return root;
    }

    private void add(int num) {
        add(num, root);
    }

    private TreeNode add(int num, TreeNode node) {
        if (node == null) {
            return new TreeNode(num);
        }
        if (num < node.val) {
            node.left = add(num, node.left);
        } else {
            node.right = add(num, node.right);
        }
        return node;
    }

}
