package com.huntercodexs.zipkintracingdemo.serviceone.restcontroller;

import com.huntercodexs.zipkintracingdemo.serviceone.service.ZipkinFlowService;
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
        System.out.println("ServiceOne - zipkinFlowStart");
        LOG.info("ServiceOne - zipkinFlowStart");
        log.info("ServiceOne - zipkinFlowStart @Slf4j");
        return zipkinFlowService.start();
    }

    /**
     * Zipkin Flow Finish
     */
    @GetMapping(path = "/zipkin-flow/finish")
    public ResponseEntity<?> finish() {
        System.out.println("ServiceOne - zipkinFlowFinish");
        LOG.info("ServiceOne - zipkinFlowFinish");
        log.info("ServiceOne - zipkinFlowFinish @Slf4j");
        return ResponseEntity.ok().body("ServiceOne - zipkinFlowFinish");
    }

}
