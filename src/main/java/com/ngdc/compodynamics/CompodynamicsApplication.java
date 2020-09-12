package com.ngdc.compodynamics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.ngdc.compodynamics.dao")
public class CompodynamicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompodynamicsApplication.class, args);
	}

}
