package com.ty.yelipay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.ty.yelipay.*.*.mapper")
public class YelipayApplication {

	public static void main(String[] args) {
		SpringApplication.run(YelipayApplication.class, args);
	}

}
