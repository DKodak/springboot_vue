package com.kd.springboot_vue.service;

import com.kd.springboot_vue.common.MyResult;
import com.kd.springboot_vue.model.UserInfo;

import java.util.List;

/**
 * @author Kodak
 * @version 1.0
 * @create 2019/08/15/13:37
 */
public interface UserService {
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	MyResult login(UserInfo user);

	/**
	 * 查询全部数据
	 * @return
	 */
	List<UserInfo> queryUser();

	/**
	 * 注册
	 * @param user
	 * @return
	 */
	MyResult register(UserInfo user);

	/**
	 * 查询是否存在改用户
	 * @param userInfo
	 * @return
	 */
	UserInfo queryorUser(UserInfo userInfo);
}
