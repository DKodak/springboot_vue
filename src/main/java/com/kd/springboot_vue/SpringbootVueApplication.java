package com.kd.springboot_vue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kd.springboot_vue.dao")
public class SpringbootVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootVueApplication.class, args);
	}

}
