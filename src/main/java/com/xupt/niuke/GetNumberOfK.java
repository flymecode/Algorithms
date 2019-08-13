package com.xupt.niuke;

import com.xupt.offer.M;

/**
 * @author maxu
 * @description 统计一个数字在排序数组中出现的次数。
 * @date 2019-08-13
 */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int left = 0;
        int right = array.length;
        int count = 0;
        int index = 0;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            int num = array[mid];
            if (num == k) {
                index = mid;
                break;
            } else if (num < k){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left > right) {
            return 0;
        }
        for (int i = index; i < array.length; i++) {
            if (array[i] == k) {
                count++;
            } else {
                break;
            }
        }
        for (int i = index-1; i >= 0; i--) {
            if (array[i] == k) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        double pow = Math.pow(2, 2);
        GetNumberOfK getNumberOfK = new GetNumberOfK();
        int[] res = {1,2,3,3,3,3,4,5};
        int i = getNumberOfK.GetNumberOfK(res, 3);
        System.out.println(i);
    }
}
