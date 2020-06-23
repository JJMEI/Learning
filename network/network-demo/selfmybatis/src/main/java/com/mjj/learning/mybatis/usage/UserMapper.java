package com.mjj.learning.mybatis.usage;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    /**
     * 获取当前id的用户信息
     * @param userId
     * @return
     */
    UserDTO queryUserInfo(@Param(value = "id") Long userId);

}
