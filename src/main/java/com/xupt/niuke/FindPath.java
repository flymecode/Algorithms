package com.xupt.niuke;

import java.util.ArrayList;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class FindPath {

    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();
    private int sum = 0;
    private int target;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        this.target =  target;
        backTrack(root,sum);
        return res;
    }

    private void backTrack(TreeNode root,int sum) {
        if (sum == target && root == null) {
            res.add(list);
            list = new ArrayList<>();
        } else {
            for (int i = 0; i <= 1; i++) {
                if (sum + root.val < target && i == 0) {
                    list.add(root.val);
                    backTrack(root.left,sum + root.val);
                } else if (sum + root.val < target && i == 1){
                    list.add(root.val);
                    backTrack(root.right,sum + root.val);
                }
                list.remove(list.size() - 1);
            }
        }
    }
}
