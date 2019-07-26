package com.xupt.offer;

public class StrToInt {

    public int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        boolean isNegative = str.charAt(0) == '-';
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            int temp  = str.charAt(i);
            if ( i == 0 && (temp == '-' || temp == '+')){
                continue;
            }
            if (temp <'0' || temp > '9') {
                return 0;
            }
            ret = ret * 10 + (temp - '0');
        }
        return isNegative? -ret : ret;
    }


}
