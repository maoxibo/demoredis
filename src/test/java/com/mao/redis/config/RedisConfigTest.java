package com.mao.redis.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by x on 2018/3/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisConfig.class)
public class RedisConfigTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testset()throws Exception{
        stringRedisTemplate.opsForValue().set("username","maoxibo");
        Assert.assertEquals("maoxibo",stringRedisTemplate.opsForValue().get("username"));

    }

}