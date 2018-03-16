package com.mao.redis.service.impl;

import com.mao.redis.dao.UserMapper;
import com.mao.redis.entry.User;
import com.mao.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by x on 2018/3/16.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public ArrayList<User> search() {

        ArrayList<User> list = userMapper.search();
        return list;
    }
}
