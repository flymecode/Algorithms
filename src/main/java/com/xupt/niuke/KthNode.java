package com.xupt.niuke;

/**
 * @author maxu
 * @description 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 * @date 2019-08-13
 */
public class KthNode {
    private int cur = 0;
    private TreeNode node = null;
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (k == 0) {
            return null;
        }
        inOrder(pRoot,k);
        return node;
    }

    private void inOrder(TreeNode pRoot,int k) {
        if (pRoot == null || cur >= k ) {
            return;
        }
        inOrder(pRoot.left,k);
        cur++;
        if (cur == k) {
            node = pRoot;
        }
        inOrder(pRoot.right,k);
    }

}
