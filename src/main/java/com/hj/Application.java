package com.hj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication // springBoot启动类
@MapperScan("com.hj.dao")
public class Application {
	   public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	   }
//测试上传github
}
 