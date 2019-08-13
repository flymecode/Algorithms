package com.xupt.leetcode;

import java.util.*;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-10
 */
public class LRUCache {
    private Map<Integer,Integer> map;
    private int size;
    private int capacity;

    public LRUCache(int capacity) {
        this.map = new LinkedHashMap<>(capacity);
        this.size = 0;
        this.capacity = capacity;
    }

    public int get(int key) {
        int val = -1;
        if (map.containsKey(key)) {
            val = map.get(key);
            map.remove(key);
            map.put(key, val);
        }
        return val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
            map.put(key, value);
        } else if (size < capacity) {
            size++;
            map.put(key, value);
        } else {
            map.put(key, value);
        }
    }
}
