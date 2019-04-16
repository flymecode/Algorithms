package com.xupt.offer;

/**
 * 实现单例模式
 * @author maxu
 * @date 2019/4/14
 */
public class Offer_1 {

    private Offer_1() {}

    private static Offer_1 instance = new Offer_1();

    public static Offer_1 getInstance() {
        return instance;
    }

}
