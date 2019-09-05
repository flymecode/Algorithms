package com.xupt.niuke;

import java.util.Stack;

/**
 * @author maxu
 * @description TODO
 * @date 2019-09-04
 */
public class Mirror {
    public void Mirror(TreeNode root) {
        if(root == null) {
            return ;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack.isEmpty()) {
            TreeNode pop = stack.pop();
            swap(pop);
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
    }
    private void swap(TreeNode root) {
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }
}
