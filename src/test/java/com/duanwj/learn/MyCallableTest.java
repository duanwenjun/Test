package com.duanwj.learn;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author 时光
 * @date 2019/9/30 15:46
 * @description
 */
@Slf4j
public class MyCallableTest extends BaseTest {
    @Test
    public void testOne() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        List<Callable<String>> callableList = MyCallable.getRunnableList();
        List<Future<String>> futures = new ArrayList<>();
        for (Callable<String> callable : callableList) {
            Future<String> future = executor.submit(callable);
            futures.add(future);
        }
        for (Future<String> future : futures) {
            String flag = future.get();
            log.info("执行结果：{},返回值；{}", future.isDone(), flag);
        }
    }
}