package com.duanwj.test;

import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author duanwj
 * @since 2019/5/6 0006 11:31
 */
public class TaskTest extends BaseTest {
    @Resource
    private Task task;

    @Test
    public void doTaskOne() throws Exception {
        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
    }

    @Test
    public void doTaskTwo() {
    }

    @Test
    public void doTaskThree() {
    }
}