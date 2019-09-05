package com.xupt.stream;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.internal.builders.JUnit3Builder;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import sun.rmi.rmic.Main;

import java.util.*;

/**
 * @author maxu
 * @description TODO
 * @date 2019-08-15
 */
public class StreamTest {

    public static void main(String[] args) {

        Map<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("name5", "value5");
        hashMap.put("name6", "value6");
        hashMap.put("name7", "value7");
        Set<Map.Entry<String, String>> set = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }

    }

}
