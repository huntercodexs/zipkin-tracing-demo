package com.huntercodexs.zipkintracingdemo.servicetwo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ServiceTwoApplication {

	public static void main(String[] args) {
		log.debug("SERVICE-TWO START");
		SpringApplication.run(ServiceTwoApplication.class, args);
	}

}
