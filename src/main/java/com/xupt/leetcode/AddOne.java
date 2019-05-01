package com.xupt.leetcode;

import java.util.Arrays;

/**
 * @author maxu
 * @date 2019/4/29
 */
public class AddOne {
    public static void main(String[] args) {
        AddOne addOne = new AddOne();
        int[] ints = addOne.plusOne(new int[]{9});
        System.out.println(Arrays.toString(ints));
    }
    public int[] plusOne(int[] digits) {
        if (digits == null) {
            return null;
        }
        boolean flag = true;
        for (int i = 0; i < digits.length && flag; i++) {
            if (digits[i] != 9) {
                flag = false;
            }
        }
        if (flag) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            for (int i = digits.length - 1; i >= 0 ; i--) {
                if (digits[i] + 1 == 10) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    break;
                }
            }
        }
        return digits;
    }
}
