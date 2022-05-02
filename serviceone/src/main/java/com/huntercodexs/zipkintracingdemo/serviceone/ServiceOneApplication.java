package com.huntercodexs.zipkintracingdemo.serviceone;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration
public class ServiceOneApplication {

	public static void main(String[] args) {
		log.debug("SERVICE-ONE START");
		SpringApplication.run(ServiceOneApplication.class, args);
	}

}
