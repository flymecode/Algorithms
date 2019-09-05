package com.xupt.niuke;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-30
 */
public class ThreeColorSort {
    void ThreeColorSort(int[] array) {
        int p1 = 0;
        int p2 = array.length - 1;
        int i = 0;
        while(i <= p2) {
            if (array[i] == 2) {
                int temp = array[i];
                array[i] = array[p2];
                array[p2--] = temp;
            } else if (array[i] == 0 && i > 0){
                int temp = array[i];
                array[i] = array[p1];
                array[p1++] = temp;
            } else {
                i++;
            }
        }
    }

}
