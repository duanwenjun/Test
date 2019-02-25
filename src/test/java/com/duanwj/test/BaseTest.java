package com.duanwj.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试基础类，其他单元测试继承即可
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public abstract class BaseTest {
}
