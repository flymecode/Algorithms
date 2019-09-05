package com.xupt.toutiao;

import java.util.*;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-25
 */
public class T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 输入组数
        int n = input.nextInt();
        // 输入数字
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(func(input.nextInt())){
                res.add("true");
            } else {
                res.add("false");
            }
        }
        for (String s: res) {
            System.out.println(s);
        }
    }


    public static boolean func(int n) {
        // 保存循环结果
        Set<Integer> res = new HashSet<>();
        res.add(n);
        while(n != 1) {
            int temp = 0;
            while(n != 0) {
                temp += Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (res.contains(temp)) {
                return false;
            }
            n = temp;
            res.add(n);
        }
        return true;
    }
}
