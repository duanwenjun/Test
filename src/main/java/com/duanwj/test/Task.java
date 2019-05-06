package com.duanwj.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * 定时任务
 *
 * @author duanwj
 * @since 2019/5/6 0006 11:30
 */
@Slf4j
@Component
public class Task {
    private static Random random = new Random();

    @Async
    public void doTaskOne() throws Exception {
        log.info("开始做任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务一，耗时：{}秒", (end - start) / 1000);
    }

    @Async
    public void doTaskTwo() throws Exception {
        log.info("开始做任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务二，耗时：{}秒", (end - start) / 1000);
    }

    @Async("taskExecutor")
    public void doTaskThree() throws Exception {
        log.info("开始做任务三");
        LocalDateTime start = LocalDateTime.now();
        Thread.sleep(random.nextInt(10000));
        LocalDateTime end = LocalDateTime.now();
        long seconds = Duration.between(start, end).getSeconds();
        log.info("完成任务三，耗时：{}秒", seconds);
    }
}
