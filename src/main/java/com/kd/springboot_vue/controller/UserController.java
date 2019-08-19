package com.kd.springboot_vue.controller;

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

//	@PostMapping("/login")
//	public MyResult login(@RequestBody UserInfo user){
//		System.out.println("进来了");
//		return userService.login(user);
//	}

	@PostMapping("/login")
	public MyResult login(@RequestBody UserInfo user){
		System.out.println("进来了"+user);
		MyResult myResult=userService.login(user);
		System.out.println(myResult);
		return myResult;
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
