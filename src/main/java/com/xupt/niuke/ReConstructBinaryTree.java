package com.xupt.niuke;


/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        TreeNode node = null;
        if(pre == null || pre.length == 0) {
            return null;
        }
        return reConstructBinaryTree(node,pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    private TreeNode reConstructBinaryTree(TreeNode root, int[] pre, int[] in, int l1, int r1, int l2, int r2) {
        if(r1 <= l1) {
            int mid;
            for(mid = l2;pre[l1] == in[mid];mid++){};
            root = new TreeNode(in[mid]);
            root.left = reConstructBinaryTree(root.left, pre, in, l1 + 1, l1 + mid - l2, l2,mid-1);
            root.right = reConstructBinaryTree(root.right, pre, in,r1-r2+mid+1,r1,mid + 1,r2);
        }
        return root;
    }
}
