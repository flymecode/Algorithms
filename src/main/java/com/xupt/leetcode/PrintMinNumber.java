package com.xupt.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * array is sort minimum
 *
 * @author maxu
 * @date 2019/5/26
 */
public class PrintMinNumber {


    public String printMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 + " " + o2).compareTo(o2 + "" + o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer);
        }
        return sb.toString();
    }
}
