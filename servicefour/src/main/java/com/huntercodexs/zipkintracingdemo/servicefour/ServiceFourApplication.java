package com.huntercodexs.zipkintracingdemo.servicefour;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ServiceFourApplication {

	public static void main(String[] args) {
		log.debug("SERVICE-FOUR START");
		SpringApplication.run(ServiceFourApplication.class, args);
	}

}
