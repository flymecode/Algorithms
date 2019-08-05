package com.xupt.niuke;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Find {

    public boolean Find(int target, int [][] array) {
        // 行
        int row = array.length-1;
        // 列
        int col = array[0].length-1;
        // 初始化
        int r = 0;
        int c = col;
        while(r <= row && c >= 0) {
            if(array[r][c] == target) {
                return true;
            } else if(array[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}
