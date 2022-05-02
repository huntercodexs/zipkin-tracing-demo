package com.huntercodexs.zipkintracingdemo.servicetwo.restcontroller;

import com.huntercodexs.zipkintracingdemo.servicetwo.service.ZipkinFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import java.util.logging.Logger;

@Slf4j
@ControllerAdvice
@RestController
@RequestMapping("${api.prefix}")
@CrossOrigin(origins = "*")
public class UserController {

    //private static final Logger LOG = Logger.getLogger(UserController.class.getName());
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    ZipkinFlowService zipkinFlowService;

    /**
     * Zipkin Flow Start
     */
    @GetMapping(path = "/zipkin-flow/start")
    public ResponseEntity<?> start() {
        System.out.println("ServiceTwo - zipkinFlowStart");
        LOG.info("ServiceTwo - zipkinFlowStart");
        log.info("ServiceTwo - zipkinFlowStart @Slf4j");
        return zipkinFlowService.start();
    }

    /**
     * Zipkin Flow Finish
     */
    @GetMapping(path = "/zipkin-flow/finish")
    public ResponseEntity<?> finish() {
        System.out.println("ServiceTwo - zipkinFlowFinish");
        LOG.info("ServiceTwo - zipkinFlowFinish");
        log.info("ServiceTwo - zipkinFlowFinish @Slf4j");
        return zipkinFlowService.finish();
    }

}
