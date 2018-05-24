package com.hmh.service;

import com.hmh.bean.UserInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by 62450 on 2018/5/24.
 */
public interface UserService {
    Page<UserInfo> findAll(Pageable pageable);

    void saveUser(UserInfo user);
}
