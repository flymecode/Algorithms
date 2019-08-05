package com.xupt.thread;

import java.util.concurrent.atomic.AtomicBoolean;

public class SwapPrint {

    private static int i = 1;
    private static char c = 'A';
    private static AtomicBoolean isLetter = new AtomicBoolean(true);
    static class PrintLetter extends Thread {
        @Override
        public void run() {
            while(c <= 'Z') {
                if (isLetter.get()) {
                    System.out.println(c);
                    c++;
                    isLetter.compareAndSet(true, false);
                }
            }
        }
    }

    static class PrintNumber extends Thread {
        @Override
        public void run() {
            while(i <= 26) {
                if (!isLetter.get()) {
                    System.out.println(i);
                    i++;
                    isLetter.compareAndSet(false, true);
                }
            }
        }
    }

    public static void main(String[] args) {
        new PrintLetter().start();
        new PrintNumber().start();
        System.nanoTime();
    }
}
