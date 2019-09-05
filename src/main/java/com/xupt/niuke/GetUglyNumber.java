package com.xupt.niuke;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-31
 */
public class GetUglyNumber {
    public static void main(String[] args) {

    }

    private int getUglyNumber(int index) {
        if (index <= 0) return 0;
        List<Integer> res = new ArrayList<>();
        res.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        int n2 = 0, n3 = 0, n5 = 0;
        int min = 0;
        while (res.size() < index) {
            n2 = res.get(i2) * 2;
            n3 = res.get(i3) * 3;
            n5 = res.get(i5) * 5;
            min = Math.min(n2, Math.min(n3, n5));
            res.add(min);
            if (min == n2) {
                i2++;
            }
            if (min == n3) {
                i3++;
            }
            if (min == n5) {
                i5++;
            }
        }
        return res.get(res.size() - 1);
    }
}
