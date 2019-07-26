package com.xupt.offer;

public class InversePairs {


    public int InversePairs(int [] array) {
        if (array == null && array.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
