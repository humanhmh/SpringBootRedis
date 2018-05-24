package com.hmh.service;

import com.hmh.bean.UserInfo;

import java.util.List;

/**
 * Created by 62450 on 2018/5/24.
 */
public interface RedisService {
    public void add(String key, UserInfo user, Long time);

    public void add(String key, List<UserInfo> users, Long time);

    public UserInfo get(String key);
}
