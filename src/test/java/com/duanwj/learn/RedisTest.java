package com.duanwj.learn;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author 时光
 * @date 2019/12/27 19:09
 * @description
 */
@Slf4j
public class RedisTest extends BaseTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testStringSetKey() {
        stringRedisTemplate.opsForValue().set("stringRedisTemplate", "stringRedisTemplate");
    }

    @Test
    public void testRedisSetKey() {
        redisTemplate.opsForValue().set("redisTemplate", "redisTemplate");
    }

    @Test
    public void testStringSetKeyUserCache() {
        UserCacheObject object = new UserCacheObject()
                .setId(1)
                .setName("test")
                .setGender(1);
        String key = String.format("user:%d", object.getId());
        redisTemplate.opsForValue().set(key, object);
    }

    @Test
    public void testStringGetKeyUserCache() {
        String key = String.format("user:%d", 1);
        UserCacheObject value = (UserCacheObject) redisTemplate.opsForValue().get(key);
        log.info("缓存值：{}", value);
    }
}
