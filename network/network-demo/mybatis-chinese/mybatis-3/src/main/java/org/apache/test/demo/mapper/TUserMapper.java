package org.apache.test.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.test.demo.pojo.TUser;

import java.util.List;

/**
 * t_user操作接口
 * @author meijunjie
 */
public interface TUserMapper {

    /**
     * 插入用户信息
     * @param tUser
     * @return  long 返回影响的行数
     */
    Long insertUser(TUser tUser);

    /**
     * 返回数据库自增的主键
     * @param tuser
     * @return
     */
    Long insertUserWithPrimaryKey(TUser tuser);

    /**
     * 批量插入用户信息
     * @param tUserList
     * @return Long 返回插入操作影响的行数
     */
    Long batchInsertUser(List<TUser> tUserList);


    /**
     * 查询用户信息
     * @param tUser
     * @return
     */
    List<TUser> queryUserInfo(TUser tUser);


    /**
     * 按id批量查询用户信息
     * @param ids
     * @return
     */
    List<TUser> queryUserInfoByIds(Long[] ids);
    /**
     * 更新用户信息
     * @param tUser
     * @return
     */
    Long updateUserInfo(TUser tUser);


    /**
     * 查询用户信息
     * @param id
     * @param userName
     * @return
     */
    List<TUser> queryUserById(@Param("id") Long id, @Param("userName") String userName);


}
