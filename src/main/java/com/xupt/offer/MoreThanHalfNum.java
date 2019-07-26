package com.xupt.offer;

public class MoreThanHalfNum {

    public static void main(String[] args) {
        int[] r = {1};
        int c = MoreThanHalfNum_Solution(r);
        System.out.println(c);
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0) {
            return 0;
        }
        int result = array[0];
        int account = 1;
        for(int i = 1; i < array.length; i++) {
            if(account == 0) {
                account = 1;
                result = array[i];
            } else if(result == array[i]) {
                account++;
            } else {
                account--;
            }
        }
        account = 0;
        for(int i =0; i < array.length; i++) {
            if(result == array[i]) {
                account++;
            }
        }
        if(account > array.length / 2) {
            return result;
        } else {
            return 0;
        }
    }
}
