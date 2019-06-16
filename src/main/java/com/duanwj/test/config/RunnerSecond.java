package com.duanwj.test.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author duanwj
 * @since 2019/6/16 0016 15:29
 */
@Slf4j
@Component
public class RunnerSecond implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("runnerSecond start");
    }
}
