package com.xupt.offer;

/**
 * 旋转数组中最小的数字
 * @author maxu
 * @date 2019/6/22
 */
public class Offer_11 {

    public static void main(String[] args) {
        int[] array = new int[]{1};
        int min = getMin(array);
        System.out.println(min);
    }

    public static int getMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] >= nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return nums[l];
    }
}
