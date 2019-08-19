package com.kd.springboot_vue.common;

import java.util.List;

/**
 * @author Kodak
 * @version 1.0
 * @create 2019/08/15/13:38
 */
public class MyResult {
	private int code;
	private String msg;
	private List<?> list;
	private Object obj;
	public  int getCode(){
		return code;
	}
	public void setCode(int code){
		this.code=code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "MyResult{" +
				"code=" + code +
				", msg='" + msg + '\'' +
				", list=" + list +
				", obj=" + obj +
				'}';
	}
}
