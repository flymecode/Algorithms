package com.xupt.offer;

/**
 * @author maxu
 * @date 2019/6/23
 */
public class Offer_12 {
    public static void main(String[] args) {
        char[][] matrix = {
                {'a','b','t','g'},
                {'c','f','c','s'},
                {'j','d','e','h'},
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        char[] str = {'b', 'f', 'c', 'e'};
        Boolean aBoolean = hasPath(matrix, rows, cols, str);
        System.out.println(aBoolean);
    }

    public static Boolean hasPath(char[][] matrix, int rows,int cols, char[] str) {
        if (matrix == null || rows < 1 || cols < 1 || str == null) {
            return false;
        }
        // 设置一个访问列表，如果已经被选中则设置为 true
        boolean[][] visited = new boolean[rows][cols];
        int pathLength = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (hasPathCore(matrix, rows, cols, row, col, str, pathLength, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasPathCore(char[][] matrix, int rows, int cols, int row, int col, char[] str, int pathLength, boolean[][] visited) {
        // 我们这里没有使用栈来进行，我采用我们递归的深度来判断我们是否已经查找到响应的路径。
        if (str.length == pathLength) {
            return true;
        }
        boolean hasPath = false;

        if (row >= 0 && row < rows && col >= 0 && col < cols && matrix[row][col] == str[pathLength] && !visited[row][col]) {
            pathLength++;
            visited[row][col] = true;
            hasPath = hasPathCore(matrix, rows, cols, row, col - 1, str, pathLength, visited)
            || hasPathCore(matrix, rows, cols, row, col + 1, str, pathLength, visited)
            || hasPathCore(matrix, rows, cols, row-1, col, str, pathLength, visited)
            || hasPathCore(matrix, rows, cols, row+1, col, str, pathLength, visited);
            // 如果返回 hashPath 为 false 则回退操作
            if (!hasPath) {
                --pathLength;
                visited[row][col] = false;
            }
        }
        return hasPath;
    }
}
