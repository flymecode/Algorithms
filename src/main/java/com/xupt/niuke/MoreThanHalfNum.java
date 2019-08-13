package com.xupt.niuke;

import javax.management.StringValueExp;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

/**
 * @author maxu
 * @description 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @date 2019-08-05
 */
public class MoreThanHalfNum {

    public static void main(String[] args) {
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            UUID uuid = UUID.randomUUID();
            long mostSigBits = uuid.getMostSignificantBits();
            long leastSigBits = uuid.getLeastSignificantBits();
            long exCodeSeed = mostSigBits ^ leastSigBits;
            StringBuilder sb = new StringBuilder();
            sb.append(Math.abs(exCodeSeed));
            int length = 19 - sb.length();
            Random random = new Random();
            random.nextInt(10);
            for (int t = 0; t < length; t++) {
                sb.append(random.nextInt(10));
            }
            System.out.println(Long.parseLong(sb.toString()));
        }
        System.out.println(set.size());

    }

    public int MoreThanHalfNum_Solution(int[] array) {
        return 0;
    }
}
