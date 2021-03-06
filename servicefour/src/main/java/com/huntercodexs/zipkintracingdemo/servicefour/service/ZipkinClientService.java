package com.huntercodexs.zipkintracingdemo.servicefour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ZipkinClientService {

    @Value("${remote.base-url-service-three}")
    String baseUrl;
    @Value("${remote.basic-auth}")
    String remoteBasicAuth;
    @Autowired
    RestTemplate restTemplate;

    protected HttpHeaders httpRequestHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", remoteBasicAuth);
        return httpHeaders;
    }

    public ResponseEntity<?> start() {

        HttpEntity<?> httpEntity = new HttpEntity<>(httpRequestHeaders());

        try {
            return restTemplate.exchange(this.baseUrl, HttpMethod.GET, httpEntity, String.class);
        } catch (RuntimeException re) {
            System.out.println("URL: " + this.baseUrl);
            System.out.printf("EXCEPTION: " + re.getMessage());
            throw new RuntimeException("Error on Zipkin Client Service Four");
        }
    }
}
