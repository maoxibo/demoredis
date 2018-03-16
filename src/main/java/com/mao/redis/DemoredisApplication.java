package com.mao.redis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.mao.redis.dao")
@SpringBootApplication
public class DemoredisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoredisApplication.class, args);
	}
}
