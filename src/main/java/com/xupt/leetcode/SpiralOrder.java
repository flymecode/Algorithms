package com.xupt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maxu
 * @description TODO
 * @date 2019-09-05
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return null;
        }
        int rows = matrix.length - 1;
        int row = 0;
        int cols = matrix[0].length - 1;
        int col = 0;

        List<Integer> list = new ArrayList<>();
        while (row <= rows && col <= cols) {
            for (int i = col; i <= cols; i++) {
                list.add(matrix[col][i]);
            }
            for (int i = row + 1; i <= rows; i++) {
                list.add(matrix[i][cols]);
            }
            if (row != rows) {
                for (int i = cols - 1; i >= col; i--) {
                    list.add(matrix[i][rows]);
                }
            }
            if (col != cols) {
                for (int i = rows - 1; i > row; i--) {
                    list.add(matrix[i][col]);
                }
            }
            row++;
            rows--;
            col++;
            cols--;
        }
        return list;
    }
}
