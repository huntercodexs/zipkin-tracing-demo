package com.huntercodexs.zipkintracingdemo.servicefour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ZipkinFlowService {

    @Autowired
    ZipkinClientService zipkinClientService;
    public ResponseEntity<?> start() {
        return zipkinClientService.start();
    }

}
