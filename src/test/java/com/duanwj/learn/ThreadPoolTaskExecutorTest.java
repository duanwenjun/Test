package com.duanwj.learn;

import com.duanwj.learn.config.TaskPoolConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * ExecutorService extends Executor
 * ThreadPoolExecutor 线程池配置
 *
 */
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
    }
}
