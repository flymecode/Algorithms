package com.xupt.offer;

/**
 * 二维数组的查找
 *
 * @author maxu
 * @date 2019/4/14
 */
public class Offer_4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(find(array, 19));
    }

    public static boolean find(int[][] array, int key) {
        if (array == null || array.length == 0) {
            return false;
        }

        int col = array.length - 1;
        int row = 0;
        while (row < array[0].length && col >= 0) {
            if (array[row][col] == key) {
                return true;
            } else if (array[row][col] > key) {
                --col;
            } else {
                ++row;
            }
        }
        return false;
    }
}
