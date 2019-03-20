package com.duanwj.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestApplicationTests {

    @Test
    public void contextLoads() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        log.info(list.toString());
    }

    @Test
    public void setTest() {
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(5);
        log.info(set.toString());
    }

    @Test
    public void hashSetTest() {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(5);
        set.forEach(e -> {
            log.info(String.valueOf(e));
        });
    }

    @Test
    public void mapTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("1", "java");
        map.put("2", "java");
        map.keySet().forEach(log::info);
    }
    @Test
    public void test(){
        System.out.println(3|9);
    }
}
