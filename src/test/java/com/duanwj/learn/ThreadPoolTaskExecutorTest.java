package com.duanwj.learn;

import com.duanwj.learn.config.TaskPoolConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
public class ThreadPoolTaskExecutorTest extends BaseTest {
    @Resource
    private TaskPoolConfig taskPoolConfig;

    @Test
    public void testOne() {
        List<Runnable> list = TaskRunnable.getRunnableList();
        for (Runnable runnable : list) {
            taskPoolConfig.taskExecutor().execute(runnable);
        }
        //todo 多线程如何保证循序执行，目前处理方法 使用SingleThreadExecutor
        //todo Executor、ExecutorService、ThreadPoolExecutor 关系
        // todo 返回值
    }
}
