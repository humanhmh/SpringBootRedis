package com.hmh.service.impl;

import com.google.gson.Gson;
import com.hmh.bean.UserInfo;
import com.hmh.service.RedisService;
import org.apache.solr.common.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by 62450 on 2018/5/24.
 */
@Component
public class RedisServiceImpl implements RedisService{
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    //redis现在对spring支持很好，不需要再手动进行配置，只需依赖注入StringRedisTemplate类即可使用

    public void add(String key, UserInfo user, Long time) {
        Gson gson = new Gson();
        stringRedisTemplate.opsForValue().set(key, gson.toJson(user), time, TimeUnit.MINUTES);
    }

    public void add(String key, List<UserInfo> users, Long time) {
        Gson gson = new Gson();
        String src = gson.toJson(users);
        stringRedisTemplate.opsForValue().set(key, src, time, TimeUnit.MINUTES);
    }

    public UserInfo get(String key) {
        String source = stringRedisTemplate.opsForValue().get(key);
        if (!StringUtils.isEmpty(source)) {
            return new Gson().fromJson(source, UserInfo.class);
        }
        return null;
    }
}
