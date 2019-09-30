package com.duanwj.learn;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * @author 时光
 * @date 2019/9/30 15:41
 * @description: callable接口实现类
 */
@Slf4j
public class MyCallable implements Callable<String> {

    private int taskNumber;

    private MyCallable(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    static List<Callable<String>> getRunnableList() {
        List<Callable<String>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MyCallable taskRunnable = new MyCallable(i);
            list.add(taskRunnable);
        }
        return list;
    }

    @Override
    public String call() throws Exception {
        log.info("任务顺序{}", taskNumber);
        return "success";
    }
}
