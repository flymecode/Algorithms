package com.xupt.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 时间复杂度为O(n^2)
 * 不稳定的排序
 * @author maxu
 * @date 2019/4/5
 */
public class SelectSort implements SortAlgorithm{

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            int min = i;
            for (int j = i+1; j < unsorted.length; j++) {
                if (SortUntils.less(unsorted[j], unsorted[min])) {
                    min = j;
                }
            }
            if (min != i) {
                SortUntils.swap(unsorted, i, min);
            }
        }
        return unsorted;
    }

    public static void main(String[] args) {
        Integer[] arr = {3,6,2,1,5,8,4,7};
        SelectSort selectSort = new SelectSort();
        Integer[] sort = selectSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }

}
