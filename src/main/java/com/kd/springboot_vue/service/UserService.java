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


	List<UserInfo> queryUser();
}
