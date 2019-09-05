package com.xupt.leetcode;

/**
 * @author maxu
 * @description TODO
 * @date 2019-09-04
 */
public class MaxNum {
    public static void main(String[] args) {
        double max = getMax(".111.10.aa77.6");
        System.out.println(max);
    }

    private static double getMax(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int j;
        double max = 0;
        for (int i = 0; i < str.length();) {
            if (!isNum(str.charAt(i))) {
                i++;
                continue;
            }
            for (j = i; j < str.length(); j++) {
                if (!isNum(str.charAt(j))) {
                    if (isD(str.charAt(j))) {
                        continue;
                    }
                    break;
                }
                double temp = Double.parseDouble(str.substring(i, j+1));
                max = Math.max(temp,max);
            }
            i = j;
        }
        return max;
    }

    private static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean isD(char c) {
        return c == '.';
    }
}
