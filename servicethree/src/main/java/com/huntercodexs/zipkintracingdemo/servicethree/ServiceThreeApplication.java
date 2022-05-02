package com.huntercodexs.zipkintracingdemo.servicethree;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ServiceThreeApplication {

	public static void main(String[] args) {
		log.debug("SERVICE-THREE START");
		SpringApplication.run(ServiceThreeApplication.class, args);
	}

}
