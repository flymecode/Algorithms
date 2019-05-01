package com.xupt.sort;

/**
 * @author maxu
 * @date 2019/4/23
 */
public class M {
    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        System.out.println(Thread.activeCount());
        t2.start();
    }

}

  /* private static int f(int i) {
        int y;
        if (i == 1) {
            y=2;
        } else {
            y = i / 2 + f(i - 1);
        }
        return y;
    }
}*/

class T extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
