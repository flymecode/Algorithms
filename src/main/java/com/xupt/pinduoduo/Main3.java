package com.xupt.pinduoduo;



// 任务调度

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

import static java.lang.Thread.interrupted;

/**
 * @author maxu
 */
public class Main3 {
    private static class MyThread2 extends Thread {
        @Override
        public void run() {
            while (!interrupted()) {
                System.out.println("start");
            }
            System.out.println("Thread end");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        final MyThread2 myThread2 = new MyThread2();
        myThread2.isInterrupted();
        myThread2.interrupt();
    }

}
