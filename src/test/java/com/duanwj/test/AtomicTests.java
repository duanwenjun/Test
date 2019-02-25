package com.duanwj.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class AtomicTests extends BaseTest {
    @Test
    public void AtomicIntegerTest() {
        AtomicInteger i = new AtomicInteger(0);
        log.info("i:{}", i.addAndGet(1));
        log.info("i:{}", i.get());
    }
}
