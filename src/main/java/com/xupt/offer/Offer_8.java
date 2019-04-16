package com.xupt.offer;

/**
 * @author maxu
 * @date 2019/4/14
 */
public class Offer_8 {
    class TreeNode {
        int value;
        TreeNode pNext;
        TreeNode left;
        TreeNode right;
    }

    TreeNode next(TreeNode pNode) {
        if (pNode == null) {
            return null;
        }
        TreeNode next = null;
        if (pNode.right != null) {
            TreeNode right = pNode.right;
            while (right.left != null) {
                right = right.left;
            }
            next = right;

        } else if (pNode.pNext != null) {
            TreeNode cur = pNode;
            TreeNode parent = pNode.pNext;
            while (parent!= null && cur == parent.right) {
                cur = parent;
                parent = parent.pNext;
            }
            next = parent;

        }
        return next;
    }

}
