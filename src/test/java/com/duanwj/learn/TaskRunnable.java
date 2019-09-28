package com.duanwj.learn;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TaskRunnable implements Runnable {

    private int taskNumber;

    private TaskRunnable(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    static List<Runnable> getRunnableList() {
        List<Runnable> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TaskRunnable taskRunnable = new TaskRunnable(i);
            list.add(taskRunnable);
        }
        return list;
    }

    @Override
    public void run() {
        log.info("任务顺序{}", taskNumber);
    }
}
