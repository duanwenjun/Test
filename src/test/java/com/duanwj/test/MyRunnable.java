package com.duanwj.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyRunnable implements Runnable {
    private static MyRunnable instance = new MyRunnable();
    private static int s = 0;

    @Override
    public void run() {
        log.info("我是线程{}开始运行", Thread.currentThread().getName());
        for (int i = 0; i < 100000; i++) {
            s++;
        }
        log.info("我是线程{}结束运行s:{}", Thread.currentThread().getName(), s);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        log.info("s:{}", s);
    }
}
