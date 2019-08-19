package com.kd.springboot_vue.dao;

import com.kd.springboot_vue.model.UserInfo;

import java.util.List;

public interface UserInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    UserInfo queryLogin(UserInfo userInfo);

    List<UserInfo> queryUser();
}
