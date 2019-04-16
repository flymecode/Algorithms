package com.xupt.offer;

/**
 * 查找数组中重复的数字
 * @author maxu
 * @date 2019/4/14
 */
public class Offer_3 {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 0, 2, 5, 3};
        String duplicate = duplicate(array);
        System.out.println(duplicate);
    }

    public static String duplicate(int[] array) {
        if (array.length == 0 || array == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            while (array[i] != i) {
                if (array[i] == array[array[i]]) {
                    sb.append(array[i] + ",");
                    break;
                }
                swap(array, i, array[i]);
            }
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    private static void swap(int[] array, int i, int temp) {
        int x = array[i];
        array[i] = array[temp];
        array[temp] = x;
    }
}
