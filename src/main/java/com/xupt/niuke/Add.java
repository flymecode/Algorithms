package com.xupt.niuke;

/**
 * @author maxu
 * @description TODO
 * @date 2019-09-04
 */
public class Add {
    public int add(int num1,int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;

    }
}
