package com.xupt.sort;

import java.util.Arrays;

/**
 * @author maxu
 * @date 2019/4/5
 */
public class Sort {
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 0, 1, 2, 3, 4,4,12,34,23,14,21};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    public static void sort(int[] array, int left, int right) {
        while (left < right) {
            int pivot = Partition(array, left, right);
            sort(array, left, pivot - 1);
            left = pivot;
        }
    }

    private static int Partition(int[] array, int left, int right) {
        int pivot = array[left];

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return left;

    }
}
