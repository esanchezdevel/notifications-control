package com.esanchez.devel.notifications.control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NotificationsControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationsControlApplication.class, args);
	}

}
