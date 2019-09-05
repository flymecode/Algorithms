package com.xupt.shopee;

import java.util.*;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-19
 */
public class Shopee1 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a,b,c");
        map.put(2, "d,e,f");
        map.put(3, "g,h,i");
        map.put(4, "j,k,l");
        map.put(5, "m,n,o");
        map.put(6, "p,q,r");
        map.put(7, "s,t,u");
        map.put(8, "v,w,x");
        map.put(9, "y,z");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = num / 10;
        int m = num % 10;
        String[] str1 = null;
        String[] str2 = null;
        if (n < m) {
            str1 = map.get(n).split(",");
            str2 = map.get(m).split(",");
        } else {
            str1 = map.get(m).split(",");
            str2 = map.get(n).split(",");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                sb.append(str1[i] + str2[j] + " ");
            }
        }
        System.out.println(sb.toString().trim());
    }

}
