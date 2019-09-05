package com.xupt.leetcode;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-23
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] res = {3};
        int i = removeElement(res, 1);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while(i < j) {
            while(nums[i] != val && i < j) {
                i++;
            }
            while(i < j) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    j--;
                    i++;
                    break;
                }
                j--;
            }
        }
        return i == 0 ? j:j+1;
    }
}
