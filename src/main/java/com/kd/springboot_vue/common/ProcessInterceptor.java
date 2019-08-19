package com.kd.springboot_vue.common;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Kodak
 * @version 1.0
 * @create 2019/08/18/11:12
 */
@Component
public class ProcessInterceptor implements HandlerInterceptor  {
	/**
	 * 配置支持vue的 put  post get  delete options请求
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @param o
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
		httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpServletResponse.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
		httpServletResponse.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");
		httpServletResponse.setHeader("X-Powered-By","Jetty");
		String method= httpServletRequest.getMethod();
		if (method.equals("OPTIONS")){
			httpServletResponse.setStatus(200);
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
	}
}
