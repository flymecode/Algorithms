package com.xupt;

import java.util.*;

/**
 * @author maxu
 * @description 给定一个整数的数组，找出其中的pair(a,  b)，使得a+b=0，并返回这样的pair数目。（a,  b）和(b,  a)是同一组。
 * @date 2019-09-03
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] num = input.nextLine().split(",");
        int[] nums = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            nums[i] = Integer.parseInt(num[i]);
        }
        Arrays.sort(nums);
        int i = 0;
        for (;i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
        }
        if (i == nums.length) {
            System.out.println(0);
        }
        int res = 0;
        for (int k = 0; k < i; k++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[k] + nums[j] == 0) {
                    nums[j] = 0;
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
