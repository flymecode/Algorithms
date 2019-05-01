package com.xupt.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author maxu
 * @date 2019/5/1
 */


public class LevelOrder {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.right = treeNode5;
        treeNode3.left = treeNode4;

        levelOrder(treeNode1);

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        int nextLevel = 0;
        int temp = 1;
        TreeNode cur = null;
        List<Integer> s = new ArrayList<>();
        while (!queue.isEmpty()) {
            cur = queue.poll();
            s.add(cur.val);
            if (cur.left != null) {
                nextLevel++;
                queue.add(cur.left);
            }
            if (cur.right != null) {
                nextLevel++;
                queue.add(cur.right);
            }
            temp--;
            if (temp == 0) {
                temp = nextLevel;
                nextLevel = 0;
                res.add(s);
                s = new ArrayList<>();
            }
        }
        return res;
    }
}
