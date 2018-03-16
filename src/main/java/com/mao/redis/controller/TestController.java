package com.mao.redis.controller;

import com.mao.redis.entry.User;
import com.mao.redis.service.UserService;
import com.mao.redis.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by x on 2018/3/15.
 */
@RestController
@RequestMapping("/testController")
public class TestController {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private UserService userService;

    @GetMapping(value="/test")
    public void test(){
        //redisUtils.set("456","I love you");
        User u = new User();
        u.setName("张三");
        u.setUd("12345678");
        u.setPhone("13785768767");
        //expireTime是过期时间   TimeUnit是设置过期时间是分还是秒还是小时
        //redisUtils.set(u.getUd(),u,new Long((long)60), TimeUnit.SECONDS);
        //redisUtils.set("person","对不起",new Long((long)30), TimeUnit.SECONDS);
        System.out.print(redisUtils.get("123"));
        System.out.print(redisUtils.get("456"));
        ArrayList<User> list = userService.search();
        Iterator it = list.iterator();
        while (it.hasNext()){
            User u1 = (User)it.next();
            System.out.println(u1.getName());
        }

    }
}
