package com.xupt.offer;

/**
 * 机器人的运动范围
 * @author maxu
 * @date 2019/6/24
 */
public class Offer_13 {

    public static int movingCount(int threshold, int rows,int cols) {
        if (threshold < 0 || rows <= 0 || cols <= 0) {
            return 0;
        }
        boolean[][] visited = new boolean[rows][cols];
        int count = movingCount(threshold, rows, cols, 0, 0, visited);
        return count;
    }

    private static int movingCount(int threshold, int rows, int cols, int row, int col, boolean[][] visited) {
        int count = 0;
        if (check(threshold,rows,cols, row, col,visited)) {
            visited[row][col] = true;
            // 如果该节点符合，则进行下一步递归调用
            count = 1 + movingCount(threshold, rows, cols, row, col + 1, visited)
                    + movingCount(threshold, rows, cols, row, col - 1, visited)
                    + movingCount(threshold, rows, cols, row + 1, col, visited)
                    + movingCount(threshold, rows, cols, row - 1, col, visited);
        }
        return count;
    }

    private static boolean check(int threshold, int rows, int cols, int row, int col, boolean[][] visited) {
        if (row >= 0 && col >=0 && row < rows && col < cols && !visited[row][col] && getSum(row) + getSum(col) <= threshold) {
            return true;
        }
        return false;
    }
    private static int getSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
