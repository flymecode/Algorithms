package com.xupt.sort;


/**
 * 插入排序
 *
 * @author maxu
 */
public class InsertionSort implements SortAlgorithm {

    /**
     * 每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左侧数组依然有序。
     * 对于数组 {3, 5, 2, 4, 1}，它具有以下逆序：(3, 2), (3, 1), (5, 2), (5, 4), (5, 1), (2, 1), (4, 1)，
     * 插入排序每次只能交换相邻元素，令逆序数量减少 1，因此插入排序需要交换的次数为逆序数量。
     * 插入排序的复杂度取决于数组的初始顺序，如果数组已经部分有序了，逆序较少，那么插入排序会很快。
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr) {
        return sort(arr, 0, arr.length - 1);
    }

    public <T extends Comparable<T>> T[] sort(T[] unsorted, int left, int right) {
        for (int i = left + 1; i < right + 1; i++) {
            T cur = unsorted[i];
            int j = i - 1;
            // 1 3 4 2 5
            while (j >= 0 && SortUntils.less(cur, unsorted[j])) {
                // 将前一个元素覆盖后一个元素
                unsorted[j + 1] = unsorted[j];
                j--;
            }
            // 将cur放到合适的位置
            unsorted[j + 1] = cur;
        }
        return unsorted;
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        Integer[] arr = {1, 3, 4, 2, 5, 52, 34, 52, 43, 54, 32};
        Integer[] sort1 = sort.sort(arr,0,4);
        SortUntils.print(sort1);
    }
}
