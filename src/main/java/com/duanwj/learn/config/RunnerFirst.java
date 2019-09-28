package com.duanwj.learn.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 初始化容器执行方法
 * @author duanwj
 * @since 2019/6/16 0016 15:29
 */
@Slf4j
@Component
public class RunnerFirst implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("runnerFirst start");
    }
}
