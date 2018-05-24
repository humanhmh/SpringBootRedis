package com.hmh.service.impl;

import com.hmh.bean.UserInfo;
import com.hmh.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * Created by 62450 on 2018/5/24.
 */
@Component
public class UserServiceImpl implements UserService{
    @Override
    public Page<UserInfo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public void saveUser(UserInfo user) {

    }
}
