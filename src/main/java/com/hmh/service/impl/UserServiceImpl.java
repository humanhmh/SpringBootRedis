package com.hmh.service.impl;

import com.hmh.bean.UserInfo;
import com.hmh.mapper.UserMapper;
import com.hmh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.LongAdder;

/**
 * Created by 62450 on 2018/5/24.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<UserInfo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public void saveUser(UserInfo user) {
        LongAdder count =new LongAdder();
    }

    @Override
    public UserInfo getById(int id) {
        return userMapper.getById(id);
    }
}
