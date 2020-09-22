package com.xtk.xtkanalyst.mapper;

import com.xtk.xtkanalyst.entity.User;

public interface UserMapper {
    int insert(User record);
    int insertSelective(User record);
    public User getUser();


}