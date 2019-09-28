package com.duanwj.learn;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyRunnable implements Runnable {
    private static int j = 0;

    @Override
    public void run() {
        add();
        log.info("累计后的值：{}", j);
    }

    private static synchronized void add() {
        for (int i = 0; i < 100; i++) {
            j++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable instance = new MyRunnable();
        MyRunnable instance1 = new MyRunnable();
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        log.info("累计后的值：{}", j);
    }
}
