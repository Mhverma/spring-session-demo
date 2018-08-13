package com.manoj.training.spring.springsessiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
@EnableJdbcHttpSession
public class SpringSessionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSessionDemoApplication.class, args);
	}
}
