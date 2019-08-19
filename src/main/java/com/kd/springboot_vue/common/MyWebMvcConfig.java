package com.kd.springboot_vue.common;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Kodak
 * @version 1.0
 * @create 2019/08/18/11:13
 */
@Component
public class MyWebMvcConfig implements WebMvcConfigurer {
	/**
	 * 配置支持访问文件
	 * @param registry
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {

		registry.addMapping("/**")
				.allowCredentials(true)
				.allowedHeaders("*")
				.allowedOrigins("*")
				.allowedMethods("*");

	}
}
