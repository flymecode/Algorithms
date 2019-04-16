package com.xupt.leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author maxu
 * @date 2019/4/11
 */
public class Solution_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = input.nextInt();
        }
        int[] result = getStep(number);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] getStep(int[] number) {
        int[] temp = new int[number.length];
        Set set = new HashSet();
        for (int i = 0; i < number.length; i++) {
            set.clear();
            int t = number[i];
            int count = 0;
            while (t != 1) {
                if (!set.contains(t)) {
                    count++;
                    set.add(t);
                } else {
                    count = -1;
                    break;
                }
                if (t % 2 != 0) {
                    t = 3 * t + 1;
                } else {
                    t = t / 2;
                }
            }
            temp[i] = count;
        }
        return temp;
    }
}

