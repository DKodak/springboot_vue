package com.kd.springboot_vue.controller;

import com.kd.springboot_vue.common.MD5Util;
import com.kd.springboot_vue.common.MyResult;
import com.kd.springboot_vue.model.UserInfo;
import com.kd.springboot_vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Kodak
 * @version 1.0
 * @create 2019/08/15/13:35
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	 private 	UserService userService;


	@PostMapping("/login")
	public MyResult login(@RequestBody UserInfo user){
		System.out.println("进来了"+user);
		//解密登录
		String pwd=MD5Util.convertMD5(MD5Util.convertMD5(user.getPassword()));
		user.setPassword(pwd);
		MyResult myResult=userService.login(user);
		System.out.println(myResult);
		return myResult;
	}

	/**
	 * 注册
	 * @return
	 */
	@PostMapping("/register")
	public MyResult register(@RequestBody UserInfo user){
		//先去查询保证只能存在一个用户
		System.out.println("进入了注册");
		UserInfo userInfo = userService.queryorUser(user);
		if (userInfo==null){
			//加密保存数据库
			String pwd=	MD5Util.string2MD5(user.getPassword());
			user.setPassword(pwd);
		return 	userService.register(user);
		}else {
			MyResult myResult=new MyResult();
			myResult.setMsg("用户名不能相同！");
			myResult.setCode(500);
			return myResult;
		}
	}
	@GetMapping("/query")
	public List<UserInfo> queryUser(){
		System.out.println("查询全部数据");
		return userService.queryUser();
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}
}
