package com.xupt.leetcode;

public class Solution_11 {

    public static void main(String[] args) {
        Solution_11 solution_11 = new Solution_11();
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = solution_11.maxArea(array);
        System.out.println(maxArea);

    }

    public int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
