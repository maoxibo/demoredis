package com.mao.redis.util;


import com.mao.redis.dto.Result;

/**
 * Created by x on 2018/3/28.
 */
public class ResultUtil {



    public static Result success(Object data){
        Result result = new Result();
        result.setData(data);
        result.setSuccess(true);
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setSuccess(false);
        result.setError(msg);
        return result;
    }
}
