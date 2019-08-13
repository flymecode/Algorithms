package com.xupt.niuke;

import java.util.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/**
 * @author maxu
 * @description TODO
 * @date 2019-08-13
 */
public class FirstNotRepeatingChar {
    private Map<Character, Integer> res = new LinkedHashMap<>();
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.trim().length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (res.containsKey(c)) {
                res.put(c, res.get(c) + 1);
            } else {
                res.put(c, 1);
            }
        }
        Character c = null;
        int index = -1;
        Set<Map.Entry<Character, Integer>> entries = res.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            if (res.get(key) == 1) {
                c = key;
                break;
            }
        }
        if (c != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}
