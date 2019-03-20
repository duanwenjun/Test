package com.duanwj.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (; ; ) {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("执行了：{}", MyThread.currentThread().getName());
        }
    }

    public MyThread(String name) {
        super(name);
        this.setName(name);
    }

    public static void main(String[] args) {
        MyThread a = new MyThread("a");
        MyThread b = new MyThread("b");
        MyThread c = new MyThread("c");
        MyThread d = new MyThread("d");
        MyThread e = new MyThread("e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
