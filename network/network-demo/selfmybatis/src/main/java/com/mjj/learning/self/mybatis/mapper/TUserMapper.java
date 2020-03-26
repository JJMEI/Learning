package com.mjj.learning.self.mybatis.mapper;

import com.mjj.learning.self.mybatis.entity.TUser;

import java.util.List;

public interface TUserMapper {

    TUser selectByPrimaryKey(Integer id);
    List<TUser> selectAll();
}
