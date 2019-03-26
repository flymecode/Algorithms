package com.xupt.find;

/**
 * 二分查找
 *
 * @author maxu
 * @date 2019/3/26
 */
public class BinarySearch {

    /**
     * 当未查找到的时候返回 -1
     *
     * @param key
     * @param array 必须是排序好的数组
     */
    public static int rank(int key, int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int temp = array[mid];
            if (key < temp) {
                right = mid - 1;
            } else if (key > temp) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 递归实现
     *
     * @param key
     * @param array
     * @return
     */
    public static int rankDif(int key, int[] array) {
        int left = 0;
        int right = array.length - 1;
        int count = 1;
        return rank(count,left, right, array, key);
    }

    private static int rank(int count ,int left, int right, int[] array, int key) {
        System.out.println("递归深度----------->" + count++);

        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (array[mid] == key) {
            return mid;
        } else if (key < array[mid]) {
            return rank(count,left, mid - 1, array, key);
        } else {
            return rank(count,mid + 1, right, array, key);
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 34, 55};
        int rank = rankDif(345, array);
        System.out.println(rank);
        System.out.println(4.1 >= 4);
    }
}
