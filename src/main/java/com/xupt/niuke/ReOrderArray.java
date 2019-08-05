package com.xupt.niuke;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        int odd = 0;
        for (int i : array) {
            if (isOdd(i)) {
                odd++;
            }
        }
        int[] clone = array.clone();
        for (int i = 0,j=0; i < clone.length; i++) {
            if (isOdd(clone[i])) {
                array[j++] = clone[i];
            } else {
                array[odd++] = clone[i];
            }
        }
    }

    private boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
