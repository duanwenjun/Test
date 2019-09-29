package com.duanwj.learn;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池创建形式
 * 1.Executor框架的工具类Executors 创建 （不推荐）
 * 方法一又有四种实现方式：FixedThreadPool、SingleThreadExecutor、CachedThreadPool
 * 2.Executor框架的工具类ThreadPoolExecutor创建 (推荐)
 */
@Slf4j
public class ThreadPoolTest extends BaseTest {
    /**
     * 单线程化线程池
     */
    @Test
    public void newSingleThreadExecutorTest() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        List<Runnable> list = TaskRunnable.getRunnableList();
        for (Runnable runnable : list) {
            executor.submit(runnable);
        }
    }
    /**
     * 可控最大并发数线程池
     */
    @Test
    public void newFixedThreadPoolTest() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Runnable> list = TaskRunnable.getRunnableList();
        for (Runnable runnable : list) {
            executor.submit(runnable);
        }
    }

    /**
     * 可回收缓存线程池
     */
    @Test
    public void newCachedThreadPoolTest() {
        ExecutorService executor = Executors.newCachedThreadPool();
        List<Runnable> list = TaskRunnable.getRunnableList();
        for (Runnable runnable : list) {
            executor.submit(runnable);
        }
    }
    /**
     * 定时与周期性任务线程池
     */
    @Test
    public void newScheduledThreadPoolTest() {
        ExecutorService executor = Executors.newScheduledThreadPool(2);
        List<Runnable> list = TaskRunnable.getRunnableList();
        for (Runnable runnable : list) {
            executor.submit(runnable);
        }
    }

}
