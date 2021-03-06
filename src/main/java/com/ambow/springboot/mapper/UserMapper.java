package com.ambow.springboot.mapper;

import com.ambow.springboot.entity.User;

import java.util.List;

public interface UserMapper {
    /*
     * 登录方法
     * */
    User login(User user);
    /*
     *注册方法
     */
    int insert(User record);
    /*
    * 查询用户手机是否注册过
    * */
    User listphone(User user);
    /*
     * 查询所有User
    * */
    List<User> listUser();
    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}