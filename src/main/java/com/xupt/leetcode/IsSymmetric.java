package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/1
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode root2, TreeNode root1) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
    }
}
