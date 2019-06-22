package com.xupt.offer;

/**
 * 实现单例模式
 * @author maxu
 * @date 2019/4/14
 */
public class Offer_1 {

    /**这里我们使用静态构造函数来实现单例模式*/
    private static Offer_1 instance = new Offer_1();

    public static Offer_1 getInstance() {
        return instance;
    }

}

class Singleton {
    public static Singleton getInstance() {
        return InnerClass.instance;
    }
    private static class InnerClass {
        private static Singleton instance = new Singleton();
    }
}

class Singleton2 {
    private static Singleton2 instance = null;

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }


}
