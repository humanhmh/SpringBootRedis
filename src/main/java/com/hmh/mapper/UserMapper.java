package com.hmh.mapper;

import com.hmh.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by 62450 on 2018/5/31.
 */
@Mapper
//@Repository
public interface UserMapper {
    UserInfo getById(int id);
}
