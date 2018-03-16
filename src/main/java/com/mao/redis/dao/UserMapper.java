package com.mao.redis.dao;

import com.mao.redis.entry.User;

import java.util.ArrayList;

/**
 * Created by x on 2018/3/16.
 */
public interface UserMapper {


    ArrayList<User> search();
}
