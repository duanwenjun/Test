package com.duanwj.learn;

/**
 * 单例模式
 *
 * @author 15737
 */
public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
