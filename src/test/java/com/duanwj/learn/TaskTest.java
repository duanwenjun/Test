package com.duanwj.learn;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author duanwj
 * @since 2019/5/6 0006 11:31
 */
@Slf4j
public class TaskTest extends BaseTest {
    @Resource
    private Task task;

    @Test
    public void doTaskOne() throws Exception {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        log.info("当前线程为 {}，请求方法为 {}，请求路径为：{}", Thread.currentThread().getName(), request.getMethod(), request.getRequestURL().toString());
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