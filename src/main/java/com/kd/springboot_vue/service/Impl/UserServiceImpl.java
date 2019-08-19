package com.kd.springboot_vue.service.Impl;

import com.kd.springboot_vue.common.MyResult;
import com.kd.springboot_vue.dao.UserInfoDao;
import com.kd.springboot_vue.model.UserInfo;
import com.kd.springboot_vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kodak
 * @version 1.0
 * @create 2019/08/15/13:37
 */
@Service(value = "UserService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public MyResult login(UserInfo user) {
		UserInfo u=	userInfoDao.queryLogin(user);
		System.out.println("进入了impl");
		MyResult result=new MyResult();
		if (u!=null){
			result.setCode(200);
			result.setMsg("登录成功!");
			result.setObj(u);
		}else {
			result.setCode(500);
			result.setMsg("登录失败!");
		}
		return result;
	}

	@Override
	public List<UserInfo> queryUser() {
		List<UserInfo> userInfos= userInfoDao.queryUser();
		for (UserInfo userInfo : userInfos) {
			System.out.println(userInfo+"");
		}
		MyResult result=new MyResult();
		if (userInfos.size()==0 ||userInfos==null){
			result.setCode(500);
			result.setMsg("暂无数据!");
		}else {
			result.setCode(200);
			result.setObj(userInfos);
		}
		return userInfos;
	}

	@Override
	public MyResult register(UserInfo user) {
		int results=userInfoDao.insert(user);
		MyResult result=new MyResult();
		if (results>0){
			result.setCode(200);
			result.setMsg("注册成功!");
		}else {
			result.setCode(500);
			result.setMsg("注册失败!");
		}
		return result;
	}

	@Override
	public UserInfo queryorUser(UserInfo userInfo) {
		return userInfoDao.queryLogin(userInfo);
	}
}
