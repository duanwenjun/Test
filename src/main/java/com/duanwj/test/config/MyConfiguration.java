package com.duanwj.test.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author duanwj
 * @since 2019/6/16 0016 16:20
 */
@Configuration
@Slf4j
public class MyConfiguration {
    @Bean
    public MyBean myBean() {
        log.info("myBean Initialized");
        return new MyBean();
    }
}
