package com.xupt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author maxu
 * @description 给定一个整数的数组，找出其中的pair(a,  b)，使得a+b=0，并返回这样的pair数目。（a,  b）和(b,  a)是同一组。
 * @date 2019-09-03
 */
public class M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] num = input.nextLine().replace(" ", "").split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : num) {
            list.add(Integer.valueOf(s));
        }
        Map<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Integer num1 = list.get(i);
                Integer num2 = list.get(j);
                if (num1 + num2 == 0) {
                    if (num1 > num2) {
                        if (res.containsKey(num1)) {
                            continue;
                        } else {
                            res.put(num1, num2);
                        }
                    } else {
                        if (res.containsKey(num2)) {
                            continue;
                        } else {
                            res.put(num2, num1);
                        }
                    }
                }
            }
        }

        System.out.println(res.size());
    }
}
