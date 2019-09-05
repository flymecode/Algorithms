package com.xupt.shopee;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-24
 */
public class Shopee2 {
    private static int[] array = {20, 10, 5, 4, 2, 1};
    private static int count = Integer.MAX_VALUE;
    public static void main(String[] args) {
        get(0,7, 0);
        System.out.println(count);
    }

    public static void get(int index,int num, int cur) {
        if(num == 0) {
            if (cur < count) {
                count = cur;
            }
        } else {
            for (int i = index; i < array.length; i++) {
                num = num - array[i];
                if (num >= 0) {
                    get(i, num, cur + 1);
                }
                num = num + array[i];
            }
        }
    }
}
