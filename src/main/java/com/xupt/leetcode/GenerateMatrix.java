package com.xupt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maxu
 * @description TODO
 * @date 2019-09-05
 */
public class GenerateMatrix {

    public static void main(String[] args) {
        generateMatrix(3);
    }
    public static int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];
        int rows = n-1;
        int row = 0;
        int cols = n-1;
        int col = 0;

        int c = 1;
        while (row <= rows && col <= cols) {
            for (int i = col; i <= cols; i++) {
                res[row][i] = c++;
            }
            for (int i = row + 1; i <= rows; i++) {
                res[i][cols] = c++;
            }
            if (row != rows) {
                for (int i = cols - 1; i >= col; i--) {
                    res[i][rows] = c++;
                }
            }
            if (col != cols) {
                for (int i = rows - 1; i > row; i--) {
                    res[i][col] = c++;
                }
            }
            row++;
            rows--;
            col++;
            cols--;
        }
        return res;
    }
}
