package com.xupt.niuke;

/**
 * @author maxu
 * @description 有序数组的中位数
 * @date 2019-09-02
 */
public class findMedianSortedArrays {
    public static void main(String[] args) {
        int[] n1 = {1, 3};
        int[] n2 = {2};
        double medianSortedArrays = findMedianSortedArrays(n1, n2);
        System.out.println(medianSortedArrays);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        double res = 0;
        int n1 = 0;
        int n2 = 0;
        while(n1 + n2 < l / 2 + 1) {
            if (nums1[n1] < nums2[n2]) {
                n1++;
            } else {
                n2++;
            }
        }
        if (l % 2 == 0) {
            res = (nums1[n1] + nums2[n2]) >> 1;
        } else {

        }
        return res;

    }
}
